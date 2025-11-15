package com.pertemuan7.salarygabungan;

public abstract class pegawai {
    protected String nama;
    protected double gajipokok;

    public pegawai(String nama, double gajipokok){
        this.nama = nama;
        this.gajipokok = gajipokok;
    }

    public abstract void tampilkanInfo();{}

    public void infodasar(){
        System.out.println("Nama : " + nama);
        System.out.println("gaji : " + gajipokok);
    }
}
