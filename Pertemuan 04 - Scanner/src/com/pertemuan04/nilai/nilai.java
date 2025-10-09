package com.pertemuan04.nilai;

import java.util.Scanner;

    public class nilai {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n====Program Nilai====");
        
        //jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = scanner.nextInt();

        //nampung/input pernilai
        double[] nilai = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {  
            System.out.print("Mahasiswa Ke-" + (i+1) + ": ");
            nilai[i] = scanner.nextInt();}

        //total nilai
        double totalNilai = 0;
        for (int i = 0; i < jumlah; i++) {
            totalNilai+=nilai[i]; }

        //rata rata
        double average = totalNilai/jumlah;

        //nampilin
        System.out.println("\n====Nilai Mahasiswa====");
        for (int i = 0; i < jumlah; i++) {
             System.out.println("Mahasiswa Ke-" + (i+1) + ": " + nilai[i]); }
        System.out.println("rata-rata Nilai Keseluruhan = " + average + "\n");
    }
}

