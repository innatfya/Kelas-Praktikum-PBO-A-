package com.pertemuan7.kendaraaninterface;

public class helikopter implements kendaraan{
    private String nama;

    public helikopter(String nama) {
    this.nama=nama;}

    @Override
    public void NyalakanMesin() {
        System.out.println("Helikopter: " + nama + " menyalakan mesin");}

    @Override
    public void MatikanMesin() {
        System.out.println("Helikopter: " + nama + " mematikan mesin");}
    
}
