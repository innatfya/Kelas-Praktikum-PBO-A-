package com.pertemuan7.tugas.gabungan;

public abstract class konser {

    protected String namaconsert;
    protected double price;

    public konser(String namaconsert, double price){
        this.namaconsert = namaconsert;
        this.price = price;}

    public abstract void tampilkanInfo();{}

    public void infodasar(){
        System.out.println("Consert Name : " + namaconsert);
        System.out.println("Price : " + price);}}