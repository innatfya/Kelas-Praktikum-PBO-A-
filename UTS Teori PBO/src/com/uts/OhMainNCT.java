package uts;

public class OhMainNCT {
    public static void main(String[] args) {
        String[] dreamMembers = {"Mark", "Renjun", "Jeno", "Haechan", "Jaemin", 
                                "Chenle", "Jisung"};
        String[] wayVMembers = {"Kun", "Ten", "Winwin", "Xiaojun", "Hendery", 
                                "Yangyang"};
        String[] wishMembers = {"Sion", "Riku", "Yushi", "Jaehee", "Sakuya", "Ryo"};
        String[] nct127Members = {"Taeyong", "Taeil", "Johnny", "Yuta", "Doyoung", 
                                "Jaehyun", "Jungwoo", "Mark", "Haechan"};

        NCTDream dream = new NCTDream(dreamMembers);
        NCTWayV wayv = new NCTWayV(wayVMembers);
        NCTWish wish = new NCTWish(wishMembers);
        NCT127 nct127 = new NCT127(nct127Members);

        dream.perform();
        dream.graduationConcept();

        wayv.perform("Phantom", "Thailand");
        wayv.promoteInChina();

        wish.perform("Wish", 2024);
        wish.debutStage();

        nct127.perform("Fact Check", "Music Bank");
        nct127.promoteInJapan();

        System.out.println("\n==========================");
        NCT group;

        group = dream;
        group.perform();

        group = wayv;
        group.perform();

        group = wish;
        group.perform(); } }