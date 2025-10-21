package encapsulation.ContohSoal;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Naufal", 20, "Pasar Rebo");
        // person1.displayInfo();
        System.out.println("Name : " + person1.getName());
        System.out.println("Age : " + person1.getAge());
        System.out.println("Address : " + person1.getAddress());

        person1.setName("Budi");
        person1.setAge(23);
        person1.setAddress("Klender");

        System.out.println("Update Information: ");
        person1.displayInfo(); }

}
