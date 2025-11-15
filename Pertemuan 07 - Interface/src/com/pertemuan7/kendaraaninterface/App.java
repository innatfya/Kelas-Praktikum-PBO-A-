package com.pertemuan7.kendaraaninterface;

public class App {
    public static void main(String[] args) {
        kendaraan Mobil = new mobil ("Avanza Veloz");
        kendaraan Helikopter = new helikopter("Sikorsky");

        Mobil.NyalakanMesin();
        Mobil.MatikanMesin();

        Helikopter.NyalakanMesin();
        Helikopter.MatikanMesin();
    }
}
