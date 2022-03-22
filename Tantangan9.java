package com.fajarikasaputra.java.tantangan;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Tantangan9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        LinkedList<Integer> list = new LinkedList<Integer>();

        int n = 0;

        System.out.printf("Masukkan N : ");

        for (n = scan.nextInt(); n > 0; n--) {

            System.out.printf("Masukkan Nilai ke %d : ", n);

            int input = scan.nextInt();

            list.add(input);

        }

        for (int i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        System.out.printf("BIlangan yang dicari : ");

        int keys = scan.nextInt();

        if (map.containsKey(keys)) {
            System.out.printf("Bilangan %d muncul %d kali", keys, map.get(keys));
        } else {
            System.out.printf("Bilangan %d tidak ada", keys);
        }

        scan.close();

    }

}

