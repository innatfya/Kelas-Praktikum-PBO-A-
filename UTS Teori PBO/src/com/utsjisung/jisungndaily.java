package utsjisung;

public class jisungndaily extends jisung {
    //property
    private String bestFriend;
    private int bookhours;
    public String comfortFood;
    public String activity;
    public String book;
    public String favoriteMovie;
    protected String sleepSchedule;

    //constructor
    public jisungndaily() {
        super ("Park Jisung", 23, "Seoul", "NCT DREAM");
            this.bestFriend = "Chenle";
            this.bookhours = 3;
            this.book = "Kimi ni seizou wo tabetai";
            this.activity = "menonton movie atau membaca buku";
            this.sleepSchedule = "12 AM - 8 AM";
            this.favoriteMovie = "Your Name";
            this.comfortFood = "Bungeoppang";}

    //overloading dan override
    @Override
    public void food() {
        System.out.println("1. Jisung sangat menyukai jajanan kaki lima khas korea " + comfortFood + "!");}
    public void restDay() {
        System.out.println("2. Jisung menghabiskan waktu luangnya dengan " + activity);}
    public void watchMovie() {
        System.out.println("3. Anime movie kesukaan Jisung ialah " + favoriteMovie);}
    public void playGame() {
        System.out.println("4. Atau terkadang Jisung membaca novel " + book + " selama " + bookhours + " jam lhoo!");}
    public void eatComfortFood() {
        System.out.println("5. Selama waktu luang tersebut, tentu saja " + comfortFood + " adalah snack pilihan Jisung!.");}
    public void sleepTime() {
        System.out.println("6. Jam tidur Jisung juga teratur, yaitu pukul " + sleepSchedule + "!");}
    public void hangout() {
        System.out.println("2. Jika weekend tiba, Jisung suka hangs out bareng " + bestFriend + " ke mall atau cafe.");}}