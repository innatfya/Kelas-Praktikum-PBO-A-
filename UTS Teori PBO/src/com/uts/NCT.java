package uts;

public class NCT {
    // 10 properti
    private String groupName;
    private int debutYear;
    protected int totalMembers;
    protected String fandomName;
    private String leader;
    private String company;
    public String concept;
    public String[] memberNames;
    private boolean isActive;
    protected String origin;
    private String genre;

    // 10 konstruktor
    public NCT(String groupName, int debutYear, int totalMembers, 
               String fandomName, String leader, String company, 
               String concept, String[] memberNames, boolean isActive, 
               String origin, String genre) {
        this.groupName = groupName;
        this.debutYear = debutYear;
        this.totalMembers = totalMembers;
        this.fandomName = fandomName;
        this.leader = leader;
        this.company = company;
        this.concept = concept;
        this.memberNames = memberNames;
        this.isActive = isActive;
        this.origin = origin;
        this.genre = genre; }

    // 10 methods
    public void displayInfo() {
        System.out.println("Group: " + groupName + " (" + debutYear + ")");
        System.out.println("Leader: " + leader);
        System.out.println("Company: " + company); }

    public void perform() {
        System.out.println(groupName + " is performing on stage!"); }

    public void releaseSong(String songTitle) {
        System.out.println(groupName + " released a song: " + songTitle); }

    public void greetFans() {
        System.out.println("Hello NCTzen! We are " + groupName + "!"); }

    protected void addMember(String name) {
        System.out.println(name + " joined " + groupName);
        totalMembers++; }

    public void removeMember(String name) {
        System.out.println(name + " left " + groupName);
        totalMembers--; }

    public void goOnTour(String city) {
        System.out.println(groupName + " is going on tour to " + city); }

    public void collaborate(String artist) {
        System.out.println(groupName + " collaborated with " + artist); }

    public void celebrateAnniversary() {
        System.out.println(groupName + " celebrates " + (2025 - debutYear) + " years together!"); }

    // Overloaded method
    public void perform(String songTitle) {
        System.out.println(groupName + " is performing " + songTitle + " live!"); } }