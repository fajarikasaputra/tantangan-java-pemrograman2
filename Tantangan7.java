package com.fajarikasaputra.java.tantangan;

import java.util.Scanner;

public class Tantangan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam;
        int menit;
        int detik;
        int angka;

        System.out.print("Masukkan detik yang ingin dikonversikan: ");
        angka = input.nextInt();

        jam = angka / 3600;
        menit = (angka%3600) / 60;
        detik = (angka%3600) % 60;

        System.out.println(detik + "Detik = " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}
