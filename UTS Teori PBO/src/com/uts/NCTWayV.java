package uts;

public class NCTWayV extends NCT {
    private String country;
    private String language;

    public NCTWayV(String[] memberNames) {
        super("WayV", 2019, 7, 
              "WayZenNi", "Kun", "Label V",
              "Global and elegant", memberNames, true, 
              "China", "C-Pop");
        this.country = "China";
        this.language = "Mandarin"; }

    @Override
    public void perform() {
        System.out.println("WayV performs gracefully in " + language); }

    public void perform(String songTitle, String country) {
        System.out.println("WayV performs " + songTitle + " in " + country); }

    public void promoteInChina() {
        System.out.println("WayV is promoting in " + country); }

    public void practice() {
        System.out.println("WayV practicing for next performance!"); }

    public void talkShow() {
        System.out.println("WayV appears on Chinese talk show!"); }

    public void releaseChineseAlbum(String title) {
        System.out.println("WayV released Chinese album: " + title); }

    public void fanInteraction() {
        System.out.println("WayV interacts warmly with fans!"); }

    public void showLeader() {
        System.out.println("Leader: Kun"); }

    public void recordSong() {
        System.out.println("WayV recording new song!"); } }