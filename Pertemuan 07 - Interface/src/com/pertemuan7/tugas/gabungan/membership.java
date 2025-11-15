package com.pertemuan7.tugas.gabungan;

public class membership extends konser implements diskon {
    public membership(String namaconsert, double price){
        super(namaconsert, price);}
    @Override
    public double brpdiskon() {
        return price * 0.18;}
    @Override
    public void tampilkanInfo(){
        infodasar();
        System.out.println("Tipe Tiket : Premium Member");
        System.out.println("Diskon : Rp." +brpdiskon()+" (Disc 18%)");
        System.out.println("Total Harga Setelah Diskon : Rp." +(price-brpdiskon()));}}