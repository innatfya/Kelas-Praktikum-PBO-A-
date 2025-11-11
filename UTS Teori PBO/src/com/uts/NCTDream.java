package uts;

public class NCTDream extends NCT {
    private String theme;
    private int avgAge;

    public NCTDream(String[] memberNames) {
        super("NCT Dream", 2016, 7, 
              "NCTzen", "Mark", "SM Entertainment",
              "Youth and energy", memberNames, true, 
              "Seoul", "K-Pop");
        this.theme = "Dream and Growth";
        this.avgAge = 22; }

    @Override
    public void perform() {
        System.out.println("NCT Dream performs with youthful energy!"); }

    public void perform(String songTitle, boolean withFans) {
        System.out.println("NCT Dream performs " + songTitle + (withFans ? " with fans!" : " without fans.")); }

    public void graduationConcept() {
        System.out.println("NCT Dream has graduation and re-entry concept."); }

    public void playfulInteraction() {
        System.out.println("NCT Dream always playful during behind scenes!"); }

    public void releaseAlbum(String title) {
        System.out.println("NCT Dream released album: " + title); }

    public void doVarietyShow() {
        System.out.println("NCT Dream joined variety show!"); }

    public void showTheme() {
        System.out.println("Concept theme: " + theme); }

    public void updateAvgAge(int age) {
        this.avgAge = age;
        System.out.println("Average age updated: " + avgAge); }

    public void unityMoment() {
        System.out.println("NCT Dream shows strong teamwork!"); } }