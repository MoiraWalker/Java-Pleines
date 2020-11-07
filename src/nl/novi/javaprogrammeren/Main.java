package nl.novi.javaprogrammeren;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // From Contest class
        double releaseLat = 52.379189;
        double releaseLong = 4.899431;
        String releaseCity = "Amsterdam";
        Date releaseDate = new Date(2021,4,16,20,23,11);
        int chipRingNumber = 1234;

        // From Clubmember class
        double arriveLat = 52.092876;
        double arriveLong = 5.104480;
        String arriveCity = "Utrecht";
        Date arrivalDate = new Date(2021,4,17,20,23,11);
        Date doveBirthDate = new Date(2019,2,1);

        String ringNumber = "NL21-1234";

        // create chipring
        ChipRing chipring = new ChipRing(chipRingNumber, releaseDate, arrivalDate, releaseLat, releaseLong, releaseCity, arriveLat, arriveLong, arriveCity);

        // create doves
        Dove dove = new Dove(doveBirthDate, ringNumber, chipring);
        Dove dove1 = new Dove(doveBirthDate, ringNumber, chipring);

        // create clubmember
        ClubMember clubMember = new ClubMember("Moira", "Walker", "Ameland", "3524An", "", "Utrecht", 52.092876, 5.104480 ,"moira.walker@live.nl", "061235678", 123, true, 123);

        System.out.println(dove);
    }
}