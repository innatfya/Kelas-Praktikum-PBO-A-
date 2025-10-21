package encapsulation.Kuis;

public class KuisHewan {
    private String name;
    private int age;

public KuisHewan(String name, int age) {
    this.name = name;
    this.age = age;}

public void displayInfo(){
    System.out.println("Hewan ini adalah " + name + " berumur " + age + " tahun ");
    System.out.println(name + " yang berumur " + age + " sedang bermain mihumihu "); }

public void setName(String name) {
    this.name = name; }
public String getName() {
    return this.name; }

public void setAge(int age) {
    this.age = age; }
public int getAge() {
    return this.age; }
}
