
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.Scanner;

public class Tantangan13 {
    public static Scanner inp;
    public static int n;
    public static int m;
    public static int q;
    public static int x1;
    public static int x2;
    public static int y1;
    public static int y2;
    public static int output;

    public Tantangan13() {
    }

    public static String inputStr(String info) {
        System.out.print(info);
        String temp = inp.nextLine();
        return temp;
    }

    public static void sum(Integer[][] m1, Integer[][] m2) {
        for (int i = 0; i < q; ++i) {
            x1 = m2[i][0] - 1;
            y1 = m2[i][1] - 1;
            x2 = m2[i][2] - 1;
            y2 = m2[i][3] - 1;

            for (int j = x1; j <= x2; ++j) {
                for (int k = y1; k <= y2; ++k) {
                    output += m1[j][k];
                }
            }

            System.out.println(output);
            output = 0;
        }

    }

    public static void main(String[] args) {
        do {
            String temp = inputStr(
                    "\nMasukkan  Nilai ( N, M, Q) dengan ketentuan 1 ≤ N, M ≤ 10.000\ndan 1 ≤ Q ≤ 100.000., pisahkan menggunakan spasi : ");
            String[] tempAr = temp.split("\\s");
            n = Integer.parseInt(tempAr[0]);
            m = Integer.parseInt(tempAr[1]);
            q = Integer.parseInt(tempAr[2]);
        } while (n < 1 || m > 10000 || q < 1 || q > 100000);

        Integer[][] matriks = new Integer[n][m];
        Integer[][] submatriks = new Integer[q][4];
        System.out.println("Elemen Matriks sebanyak " + n + " baris " + m + " kolom ");

        int sb;
        int sk;
        for (sb = 0; sb < n; ++sb) {
            System.out.print("baris ke-" + (sb + 1) + " : ");

            for (sk = 0; sk < m; ++sk) {
                matriks[sb][sk] = inp.nextInt();
            }
        }

        System.out.println("Input 4 bilangan sebanyak " + q + " kali untuk menentukan indeks sub matriks");

        for (sb = 0; sb < q; ++sb) {
            for (sk = 0; sk < 4; ++sk) {
                submatriks[sb][sk] = inp.nextInt();
            }
        }

        sum(matriks, submatriks);
    }

    static {
        inp = new Scanner(System.in);
        output = 0;
    }
}
