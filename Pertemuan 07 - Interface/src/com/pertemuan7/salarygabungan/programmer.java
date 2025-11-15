package com.pertemuan7.salarygabungan;

public class programmer extends pegawai implements bonus {
    public programmer(String nama, double gajipokok){
        super(nama, gajipokok);}
    @Override
    public double hitungbonus(){
        return gajipokok*0.15; } //0.15=15% 
    @Override
    public void tampilkanInfo(){
        infodasar();
        System.out.println("Jabatan : Programmer");
        System.out.println("Bonus : Rp." + hitungbonus());
        System.out.println("Total Gaji  : Rp." +(gajipokok+hitungbonus()));}
    
}
