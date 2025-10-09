//class mahasiswa
class mahasiswa {
    //atribut class mahasiswa
    String npm;
    String nama;  
    String jurusan;
    double ipk;
    //constructor
    mahasiswa(String paramNama,String paramJurusan , String paramNpm, double paramIpk ) {
        nama = paramNama;
        jurusan = paramJurusan;
        npm = paramNpm;
        ipk = paramIpk; }
    //method
    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("NPM      : " + npm);
        System.out.println("IPK      : " + ipk); } }