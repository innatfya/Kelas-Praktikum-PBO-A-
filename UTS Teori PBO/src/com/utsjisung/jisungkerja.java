package utsjisung;

public class jisungkerja extends jisung { 
    //property
    private String stageName;
    private String fandom;
    private String latestSong;
    public String performa;
    
    //constructor
    public jisungkerja() {
        super ("Park Jisung", 23, "Seoul", "NCT DREAM");
            this.stageName = "Jisung";
            this.fandom = "NCTzen";
            this.latestSong = "Go Back To The Future";
            this.performa = " Chiller dan ISTJ"; }

    //methods, overload dan override
    public void tour(String country) {
        System.out.println("1. " + stageName + " sedang tur konser di " + country + ".");}
    public void perform(int stageCount) {
        System.out.println("2. Penampilan terpecah oleh " + stageName + " pada lagu " + 
                            performa + " selama " + stageCount + " jam di konser.");}
    public void releaseAlbum(String title) {
        System.out.println("3. " + stageName + " bahkan spoiler dance dari album baru mereka berjudul " 
                            + title);}
    public void shareMoment() {
        System.out.println("4. " + stageName + " juga bilang kalau mereka akan upload behind-the-scenes clips dari " 
                            + latestSong + "."); }
    public void thankFans() {
        System.out.println("5. " + stageName + " sangat berterima kasih kepada " + fandom + 
                            " atas dukungan yang tiada henti!");}
    @Override
    public void perform() {
        System.out.println("1. " + stageName + " selalu tampil dengan dance dan face card yang mempesona!"); }}