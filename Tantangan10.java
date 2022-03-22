package com.fajarikasaputra.java.tantangan;

import java.util.Scanner;

public class Tantangan10 {
    public static Scanner scan = new Scanner(System.in);
    public static String[] data, tanya;

    public static String inputStr(String gett){
        System.out.print(gett + " = ");
        String isi = scan.next();
        return isi;
    }

    public static int inputInt(String gett){
        System.out.print(gett + " = ");
        int value = scan.nextInt();
        return value;
    }

    public static void inpAr(String data[]){
        int no = 1;
        for (int i = 0; i < data.length; i++) {
            String kata = inputStr("Masukkan kata ke-"+ no);
            data[i] = kata;
            no++;
        }
    }

    public static void quest(){
        int jml = 0;
        for (String i : tanya) {
            for (String j : data) {
                if (i.equalsIgnoreCase(j)) {
                    jml += 1;
                }
            }
            System.out.println(i + " = " + jml);
            jml = 0;
        }
    }

    public static void main(String args []){
        int arrLength = inputInt("Masukkan panjang data yang akan di masukan");
        data = new String[arrLength];

        inpAr(data);
        System.out.println("Sesi tanya ");
        arrLength = inputInt("Masukkan banyak pertanyaan ");
        tanya = new String[arrLength];
        inpAr(tanya);
        quest();
    }
}
