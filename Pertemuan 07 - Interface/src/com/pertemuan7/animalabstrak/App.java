package com.pertemuan7.animalabstrak;

public class App {
    public static void main(String[] args) throws Exception {
        hewan Kucing = new kucing ("molly");
        hewan Bebek = new bebek ("Hui");

        Kucing.info();
        Kucing.bersuara();

        Bebek.info();
        Bebek.bersuara();
    
    }
}
