package utsjisung;

public class jisung {
    //property
    private String fullName;
    private int age;
    protected String birthPlace;
    protected String group;
    public String food;

    //constructor
    public jisung (String fullName, int age, String birthPlace, String group) {
        this.fullName = fullName;
        this.age = age;
        this.birthPlace = birthPlace;
        this.group = group;
        this.food = food; }

    //methods
    public void introducekerja() {
        System.out.println("=====================================================================================");
        System.out.println("Hallo! Ini tentang penampilan " + fullName + " sebagai Idol dari grup " + group + "!"); 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");}
    public void introducehari() {
        System.out.println("=====================================================================================");
        System.out.println("Kalau ini adalah fun fact tentang " + fullName + " " + group + " lhoo!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");}
    public void showInfo() {
        System.out.println("=====================================================================================");
        System.out.println("Yup sedikit biodata tentangnya!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama: " + fullName + ", Umur: " + age + ", Boygroup: " + group); }
    public void kelahiran(){
        System.out.println("Dan Jisung lahir di " + birthPlace + " pada 02 Februari 2002.");}
    public void intinya() {
        System.out.println("=====================================================================================");
        System.out.println("Intinyaaa.. " + fullName + " " + group + " itu..!"); 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); }
    public void food() {
        System.out.println("1. Jisung sangat menyukai jajanan kaki lima khas korea " + food + "!"); }
    public void eatComfortFood() {
        System.out.println("5. Selama waktu luang tersebut, tentu saja " + food + " adalah snack pilihan Jisung!.");}//overload
    public void perform() {
        System.out.println("Pokoknya " + fullName + "selalu tampil dengan dance dan face card yang mempesona!"); //override
        System.out.println("====================================================================================="); } } 