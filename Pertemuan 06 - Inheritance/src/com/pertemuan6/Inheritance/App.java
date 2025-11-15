package com.pertemuan6.Inheritance;

public class App {
    public static void main(String[] args) throws Exception {
        karyawan Ridho = new karyawan ("1234", "Ridho");
        karyawan Melani = new karyawan ("1235", "Melani");
        Ridho.getinfo();
        Melani.getinfo();
        Ridho.absenpagi();
        Ridho.kerja();
        Melani.absenpagi();
        Melani.kerja();
        Ridho.absenpulang();
        Melani.absenpulang();

        dosen Andiani = new dosen("23455", "332211", "Andiani");
        dosen Ionia = new dosen("23456", "332212", "Ionia");
        Andiani.getinfo();
        Ionia.getinfo();
        Andiani.absenpagi();
        Andiani.ngajar();
        Ionia.absenpagi();
        Ionia.ngajar();
        Andiani.absenpulang();
        Ionia.absenpulang(); } }

