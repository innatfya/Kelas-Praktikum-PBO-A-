package encapsulation.Kuis;

public class MainKuisHewan {
    public static void main (String[] args) {
        KuisHewan Hewan1 = new KuisHewan("Kucing", 3);
        //animal1.displayInfo();

        System.out.println("Hewan ini adalah : " + Hewan1.getName() + " berumur " + Hewan1.getAge());
        System.out.println(Hewan1.getName() + "yang berumur" + Hewan1.getAge() + "sedang bermain mihumihu");

        Hewan1.setName("Anjing");
        Hewan1.setAge(04);

        System.out.println("Update Information: ");
        Hewan1.displayInfo(); }
}

