package com.pertemuan6.Tugas;

public class MainTugas {
    public static void main (String[] args) {
        BangunDatar bangundatar1 = new BangunDatar();
        Persegi pou = new Persegi(5);
        PersegiPanjang birds = new PersegiPanjang(10, 3);

        bangundatar1.luas();
        bangundatar1.keliling();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Luas persegi : " + pou.luas());
        System.out.println("Keliling persegi : " + pou.luas());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Luas persegi panjang : " + birds.luas());
        System.out.println("Keliling persegi panjang : " + birds.keliling() + "\n"); } }
