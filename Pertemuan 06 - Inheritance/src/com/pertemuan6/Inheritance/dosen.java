package com.pertemuan6.Inheritance;

class dosen extends karyawan {
    private String NIDN;
    
    public dosen (String kodekaryawan, String NIDN, String nama) {
        super(kodekaryawan, nama);
        this.NIDN = NIDN;}
    
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN; }
    public void getNIDN() {
        System.out.println("NIDN : " + this.NIDN); }

    public void ngajar() {
        System.out.println(this.nama + " sedang mengajar"); }

    public void getinfo() {
        super.getinfo();
        System.out.println("NIDN : " + this.NIDN); } }