package com.pertemuan04.kasir;

import java.util.Scanner;

public class kasir {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====KASIR====");
        
        //nama
        System.out.print("Masukkan Nama Pembeli: ");
        String nama = scanner.nextLine();

        //produk
        System.out.print("Nama Produk Yang Dibeli: ");
        String produk = scanner.nextLine();
        
        //harga
        System.out.print("Harga Produk: ");
        int harga = scanner.nextInt();

        //jumlah
        System.out.print("Jumlah Produk: ");
        int jumlah = scanner.nextInt();
       
        //hasil akhir, total = harga dikali total
        float total = harga*jumlah;
        
        System.out.println("  ");
        
        //dirapihin
                System.out.println("Nama: " + nama);
                System.out.println("Produk yang dibeli: " + produk);
                System.out.println("Harga produkk: " + harga);
                System.out.println("Jumlah produkk: " + jumlah);
                System.out.println("Total harga produkk: " + total);
    }
}
