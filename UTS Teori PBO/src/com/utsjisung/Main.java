package utsjisung;

public class Main {
    public static void main(String[] args) {
        jisungkerja idol = new jisungkerja();
        jisungndaily person = new jisungndaily();

        idol.introducekerja();
        idol.tour("Indonesia");
        idol.perform(3);
        idol.releaseAlbum("Beat It Up");
        idol.shareMoment();
        idol.thankFans();

        person.introducehari();
        person.food();
        person.restDay();
        person.watchMovie();
        person.playGame();
        person.eatComfortFood();
        person.sleepTime();

        idol.showInfo();
        idol.kelahiran();
        idol.intinya();

        jisung jisungie;
        jisungie = idol;
        jisungie.perform();
        jisungndaily jichen;
        jichen = person;
        jichen.hangout();

        System.out.println("====================================================================================="); }}