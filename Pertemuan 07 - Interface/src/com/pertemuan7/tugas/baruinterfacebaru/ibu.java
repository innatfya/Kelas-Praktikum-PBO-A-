package com.pertemuan7.tugas.baruinterfacebaru;

public class ibu implements masak {
    private String nama;
    public ibu(String nama) {
    this.nama=nama;}
    @Override
    public void Pudding() {
        System.out.println("Kalau hari senin, itu jadwal " + nama + " untuk membuat pudding mangga.");}
    @Override
    public void Nasigoreng() {
        System.out.println(nama + " juga memasak nasi goreng untuk anak-anak sekolah.");}}