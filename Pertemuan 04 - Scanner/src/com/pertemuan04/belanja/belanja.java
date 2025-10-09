package com.pertemuan04.belanja;

import java.util.ArrayList;
import java.util.Scanner;

    public class belanja {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarbelanja = new ArrayList<>();
        
        System.out.println("====Daftar Belanja====");
        System.out.println("Ketik nama barangnya, kalau udah selesai ketik 'selesai'");

        while(true) {
            System.out.print("Masukkan Nama Barang: ");
            String barang = scanner.nextLine();
                if (barang.equalsIgnoreCase ("selesai")) {
            break;       
        }
                daftarbelanja.add(barang);
        }

        for (int i = 0; i < daftarbelanja.size(); i++) {
            System.out.println((i+1) + "." + daftarbelanja.get(i));
        }
    }
}

