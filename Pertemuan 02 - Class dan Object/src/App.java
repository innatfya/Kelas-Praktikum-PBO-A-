public class App {
    public static void main(String[] args) throws Exception {
        ip iphone1 = new ip();
        ip iphone2 = new ip();

        iphone1.color = "gold";
        iphone2.color = "red";

        iphone1.nyala();
        iphone1.mati();
        iphone1.berdering();

        iphone2.nyala();
        iphone2.mati();
        iphone2.berdering();
    }
}
