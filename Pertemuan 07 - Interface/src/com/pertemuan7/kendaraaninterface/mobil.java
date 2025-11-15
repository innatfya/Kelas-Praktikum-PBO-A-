package com.pertemuan7.kendaraaninterface;

public class mobil implements kendaraan{
    private String nama;

    public mobil(String nama) {
    this.nama=nama;}

    @Override
    public void NyalakanMesin() {
        System.out.println("Mobil: " + nama + " menyalakan mesin");}

    @Override
    public void MatikanMesin() {
        System.out.println("Mobil: " + nama + " mematikan mesin");}
    
}
