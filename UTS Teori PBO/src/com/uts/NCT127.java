package uts;

public class NCT127 extends NCT {
    private String baseCity;
    private String recentAlbum;

    public NCT127(String[] memberNames) {
        super("NCT 127", 2016, 9, "NCTzen", 
              "Taeyong", "SM Entertainment", "Urban and powerful", 
              memberNames, true, "Seoul", "K-Pop");
        this.baseCity = "Seoul";
        this.recentAlbum = "Fact Check"; }

    @Override
    public void perform() {
        System.out.println("NCT 127 is performing with intense choreography!"); }

    public void perform(String songTitle, String stage) {
        System.out.println("NCT 127 performs " + songTitle + " on " + stage); }

    public void promoteInJapan() {
        System.out.println("NCT 127 promoting in Japan!"); }

    public void showBaseCity() {
        System.out.println("Base city: " + baseCity); }

    public void comeback() {
        System.out.println("NCT 127 comeback with album " + recentAlbum); }

    public void releaseMV(String title) {
        System.out.println("NCT 127 released MV for " + title); }

    public void interview() {
        System.out.println("NCT 127 has a live interview!"); }

    public void fanMeeting() {
        System.out.println("NCT 127 holds a fan meeting event!"); }

    public void travel() {
        System.out.println("NCT 127 traveling for global tour!"); } }