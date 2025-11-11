package uts;

public class NCTWish extends NCT {
    private String slogan;
    private String debutSong;

    public NCTWish(String[] memberNames) {
        super("NCT Wish", 2024, 6, 
              "NCTzen", "Sion", "SM Entertainment",
              "Hopeful and refreshing", memberNames, true, 
              "Korea", "J-Pop");
        this.slogan = "Make a Wish, NCT Wish!";
        this.debutSong = "Wish"; }

    @Override
    public void perform() {
        System.out.println("NCT Wish performs their debut song " + debutSong); }

    public void perform(String songTitle, int year) {
        System.out.println("NCT Wish performs " + songTitle + " (" + year + ")"); }

    public void debutStage() {
        System.out.println("NCT Wish debut with " + debutSong); }

    public void meetFans() {
        System.out.println("NCT Wish meets fans for the first time!"); }

    public void shareSlogan() {
        System.out.println(slogan); }

    public void recordDebutSong() {
        System.out.println("Recording debut song: " + debutSong); }

    public void practiceDance() {
        System.out.println("NCT Wish is practicing choreography!"); }

    public void prepareShowcase() {
        System.out.println("Preparing for showcase debut!"); }

    public void thankFans() {
        System.out.println("NCT Wish thanks their fans!"); } }