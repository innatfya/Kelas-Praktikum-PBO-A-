package com.pertemuan6.Inheritance;

public class karyawan {
    protected String kodekaryawan;
    protected String nama;

    public karyawan(String kodekaryawan, String nama) {
        this.kodekaryawan = kodekaryawan;
        this.nama = nama; }

    public void absenpagi() {
        System.out.println(this.nama + " : absen pagi"); }

    public void kerja() {
        System.out.println(this.nama + " : sedang bekerja"); }

    public void absenpulang() {
        System.out.println(this.nama + " : absen pulang"); }

    public void getinfo() {
        System.out.println("Nama Karyawan : " + this.nama);
        System.out.println("Kode Karyawan : " + this.kodekaryawan); } }