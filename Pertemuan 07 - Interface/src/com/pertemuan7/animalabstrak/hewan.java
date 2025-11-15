package com.pertemuan7.animalabstrak;

public abstract class hewan {
    String nama;

    public hewan(String nama) {
        this.nama=nama;}
    
    public void info() {
        System.out.println("Nama Hewan : " + nama);}
    
    public abstract void bersuara();

}
