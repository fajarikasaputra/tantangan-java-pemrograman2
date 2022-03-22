
import java.util.Scanner;

public class Tantangan14 {
    private static Scanner scan;
    private static int min;
    private static int max;
    private static int a;
    private static int b;
    private static int c;
    private static int output;

    public Tantangan14() {
    }

    public static String inputStr(String info) {
        System.out.print(info);
        String temp = scan.nextLine();
        return temp;
    }

    public static void uniq() {
        for (int i = min; i <= max; ++i) {
            if (i % a == 0 && i % b != 0 && i % c != 0) {
                ++output;
            } else if (i % a != 0 && i % b == 0 && i % c != 0) {
                ++output;
            } else if (i % a != 0 && i % b != 0 && i % c == 0) {
                ++output;
            }
        }

        System.out.println(output);
    }

    public static void main(String[] args) {
        String temp1 = inputStr("Masukkan Max-Min : ");
        String[] tempA = temp1.split("\\s");
        min = Integer.parseInt(tempA[0]);
        max = Integer.parseInt(tempA[1]);

        do {
            do {
                String temp = inputStr("Masukkan 3 bilangan : ");
                String[] tempAr = temp.split("\\s");
                a = Integer.parseInt(tempAr[0]);
                b = Integer.parseInt(tempAr[1]);
                c = Integer.parseInt(tempAr[2]);
            } while (a == b);
        } while (a == c || c == b);

        uniq();
    }

    static {
        scan = new Scanner(System.in);
        output = 0;
    }
}
