
import java.util.Scanner;

public class Tantangan12 {
    public static Scanner scan;
    public static Integer n;
    public static Integer output;
    public static Integer jumlah;
    public static Integer reminder;
    public static Integer a;
    public static Integer[] m;

    public Tantangan12() {
    }

    public static String inputStr(String value) {
        System.out.print(value);
        String temp = scan.nextLine();
        return temp;
    }

    public static int Faktorial(int angka) {
        return angka != 1 && angka != 0 ? angka * Faktorial(angka - 1) : 1;
    }

    public static void main(String[] args) {
        n = Integer.parseInt(inputStr("Masukkan jumlah N : "));
        String[] temp = inputStr("M :").split("\\s");
        m = new Integer[temp.length];

        for (int i = 0; i < temp.length; ++i) {
            m[i] = Integer.parseInt(temp[i]);
            jumlah = jumlah + m[i];
        }

        reminder = n - jumlah;
        a = reminder + m.length - 1;
        output = Faktorial(a) / (Faktorial(reminder) * Faktorial(a - reminder));
        System.out.println(output);
    }

    static {
        scan = new Scanner(System.in);
        jumlah = 0;
    }
}
