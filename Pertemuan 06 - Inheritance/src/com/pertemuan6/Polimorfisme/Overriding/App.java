package com.pertemuan6.Polimorfisme.Overriding;

public class App {
    public static void main (String[] args) {
        BangunDatar bangundatar1 = new BangunDatar();
        Persegi p = new Persegi(4);
        Segitiga s = new Segitiga(4, 6);
        Lingkaran el = new Lingkaran(4);

        bangundatar1.luas();
        bangundatar1.keliling();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Luas persegi : " + p.luas());
        System.out.println("Keliling persegi : " + p.luas());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Luas segitiga : " + s.luas());
        System.out.println("Keliling segitiga : " + s.luas());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Luas lingkaran : " + el.luas());
        System.out.println("Keliling lingkaran : " + el.keliling() + "\n"); } }
