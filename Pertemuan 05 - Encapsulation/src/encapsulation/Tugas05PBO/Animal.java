package encapsulation.Tugas05PBO;
import java.util.Scanner;

public class Animal {

    private String name;
    private String type;
    private int age;

    public Animal () {}
    
    public void inputData() throws Exception { //method input
        Scanner scanner = new Scanner(System.in);
        //input hewan
        System.out.println("=================(INPUT HEWAN)=================="); 
        System.out.print("Masukkan Nama Hewan : ");
        this.name = scanner.nextLine();
        System.out.print("Masukkan Jenis Hewan : ");
        this.type = scanner.nextLine();
        System.out.print("Masukkan Umur Hewan : ");
        this.age = scanner.nextInt(); 
        //validasi umur
        if (this.age < 0) {
            System.out.println("Umur harus lebih dari 0!");
            this.age=0; } }

    public void ShowInfo(){
        System.out.println("=================( DATA HEWAN )=================");
        System.out.println("Nama Hewan : " + name);
        System.out.println("Jenis Hewan : " + type);
        System.out.println("Umur Hewan : " + age); }
    
    public void playing() {
    System.out.println("> " + name + " yang berumur " + age + " tahun sedang bermain-main."); }

    public void sleeping() {
    System.out.println("> " + name + " yang berumur " + age + " tahun sedang tidur. "); 
    System.out.println("================================================"); }
    
    //setter and getter
    public void setName(String name) {
        this.name = name; }
    public String getName() {
        return this.name; }

    public void setType(String type) {
        this.type = type; }
    public String getType() {
        return this.type; }

    public void setAge(int age) {
        if (age<0) {
            System.out.println("Umur harus lebih dari 0!");
            this.age=0; }
        else {
            this.age=age; } }
    public int getAge() {
        return this.age; }

} 

