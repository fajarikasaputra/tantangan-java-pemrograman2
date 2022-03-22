import java.util.Scanner;

public class Tantangan11 {
    public static Scanner scan;
    public static int N;
    public static int P;
    public static int Q;
    public static int M;
    public static int[] output;

    public Tantangan11() {

    }

    public static String input(String nilai) {
        System.out.print(nilai);
        String temp = scan.nextLine();
        return temp;
    }

    public static int inpVal(String info) {
        System.out.print(info);
        int temp = scan.nextInt();
        scan.nextLine();
        return temp;
    }

    public static void addValue() {
        for (int i = 0; i < N; ++i) {
            do {
                do {
                    String temp = input(
                            "\nMasukkan nilai panjang, lebar, banyaknya lipatan range 1 - 10000, pisahkan dengan spasi : ");
                    String[] tempAr = temp.split("\\s");
                    P = Integer.parseInt(tempAr[0]);
                    Q = Integer.parseInt(tempAr[1]);
                    M = Integer.parseInt(tempAr[2]);
                } while (P < 1);
            } while (Q < 1 || M < 1 || P > 10000 || Q > 10000 || M > 10000);

            fold(P, Q, M);
            int[] var5 = output;
            int var6 = var5.length;

            for (int var3 = 0; var3 < var6; ++var3) {
                int j = var5[var3];
                System.out.print(j + " ");
            }
        }

    }

    public static void fold(int a, int b, int c) {
        int bigest;
        int smallest;
        if (a > b) {
            bigest = a;
            smallest = b;
        } else {
            bigest = b;
            smallest = a;
        }

        do {
            bigest /= 2;
            if (bigest < smallest) {
                int temp = bigest;
                bigest = smallest;
                smallest = temp;
            }

            --c;
        } while (c > 0);

        output[0] = bigest;
        output[1] = smallest;
    }

    public static void main(String[] args) {
        N = inpVal("Kertas yang dimiliki : ");
        if (N < 1 || N > 10000) {
            do {
                do {
                    System.out.println("Input salah, (range 1 - 10000)");
                    N = inpVal("Banyak kertas yang dimiliki (range 1 - 10000) : ");
                } while (N <= 1);
            } while (N >= 10000);
        }

        addValue();
    }

    static {
        scan = new Scanner(System.in);
        output = new int[2];
    }
}
