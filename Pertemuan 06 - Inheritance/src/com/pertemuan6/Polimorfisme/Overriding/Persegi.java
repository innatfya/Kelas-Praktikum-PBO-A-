package com.pertemuan6.Polimorfisme.Overriding;

public class Persegi extends BangunDatar {
    private int s;
        public Persegi(int s) {
            this.s = s; }
    @Override
    public float luas() {
        return (float) (s * s); }
    @Override
    public float keliling() {
        return (float) (4 * s); } }
