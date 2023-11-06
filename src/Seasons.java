import java.util.Scanner;

public class Seasons {
    String kyz;
    String kysh;
    String jaz;
    String jay;

    public Seasons() {
    }

    public Seasons(String kyz, String kysh, String jaz, String jay) {
        this.kyz = kyz;
        this.kysh = kysh;
        this.jay = jay;
        this.jaz = jaz;

    }

    public int Seasons() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1, 2, 12:
                System.out.println("kysh");
                break;
            case 3, 4, 5:
                System.out.println("jaz");
                break;
            case 6, 7, 8:
                System.out.println("jay");
                break;
            case 9, 10, 11:
                System.out.println("kyz");
                break;
            default:
                System.out.println("invalid");
        }
        return 0;
    }
}

