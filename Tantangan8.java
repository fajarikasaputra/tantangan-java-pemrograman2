package com.fajarikasaputra.java.tantangan;

import java.util.Arrays;
import java.util.Scanner;

public class Tantangan8 {
    public static Scanner input = new Scanner(System.in);
    public static int modus,jumlahModus;
    public static int[] data;

    public static int scanner(String gett){
        System.out.print(gett + " = ");
        int value = input.nextInt();
        return value;
    }

    public static int findData(int data[], int n)
    {
        Arrays.sort(data);

        int max_count = 1, res = data[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (data[i] == data[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = data[i - 1];
                }
                curr_count = 1;
            }
        }

        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = data[n - 1];
        }

        return res;
    }

    public static void main(String args[]){
        int arrLength = scanner("Masukkan panjang data yang akan di masukan");
        data = new int[arrLength];
        int number = 1;
        for (int i = 0; i < data.length; i++) {

            int nilai = scanner("Masukkan data ke-"+ number);
            data[i] = nilai;
            number++;
        }

        modus = findData(data,arrLength);
        for (int i : data) {
            if (i == modus){
                jumlahModus++;
            }
        }
        System.out.println("Modus = "+modus+" Jml = "+jumlahModus);
    }
}

