package com.pertemuan6.Tugas;

public class PersegiPanjang extends BangunDatar {
    private int p;
    private int l;
        public PersegiPanjang(int p, int l) {
            this.p = p; 
            this.l = l; }
    @Override
    public float luas() {
        return (float) (p * l); }
    @Override
    public float keliling() {
        return (float) (2 * p + 2 * l); } }
