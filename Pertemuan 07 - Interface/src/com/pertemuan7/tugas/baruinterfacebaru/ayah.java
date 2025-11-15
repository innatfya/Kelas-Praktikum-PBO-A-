package com.pertemuan7.tugas.baruinterfacebaru;

public class ayah implements masak {
    private String nama;
    public ayah(String nama) {
    this.nama=nama;}
    @Override
    public void Pudding() {
        System.out.println("Hari minggu adalah jadwal " + nama + " untuk membuat pudding mangga.");}
    @Override
    public void Nasigoreng() {
        System.out.println("Ketika malam tiba, " + nama + " akan memasak nasi goreng");}}