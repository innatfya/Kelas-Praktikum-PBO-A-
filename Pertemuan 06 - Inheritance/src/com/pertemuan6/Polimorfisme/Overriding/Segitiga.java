package com.pertemuan6.Polimorfisme.Overriding;

public class Segitiga extends BangunDatar {
    private int a;
    private int t;
    private int s1, s2, s3;
        public Segitiga(int a, int t) {
            this.a = a;
            this.t = t; }
        public Segitiga(int s1, int s2, int s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3; }
    @Override
    public float luas() {
        return (float) (0.5 * a * t);}
    @Override
    public float keliling() {
        return (float) (s1 + s2 + s3); } }