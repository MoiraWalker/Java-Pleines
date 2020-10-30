package nl.novi.javaprogrammeren;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // From Contest
        long releaseLat = (long) 52.379189;
        long releaseLong = (long) 4.899431;
        String releaseCity = "Amsterdam";
        Date releaseDate = new Date(2021,4,16,20,23,11);
        String chipRingNumber = "NL1234";

        // From Clubmember
        long arriveLat = (long) 52.092876;
        long arriveLong = (long) 5.104480;
        String arriveCity = "Utrecht";
        Date arrivalDate = new Date(2021,4,17,20,23,11);
        Date pidgeonBirthDate = new Date(2019,2,1);
        int ringNumber = 123456;

        // Chipring test
        ChipRing chipring = new ChipRing(chipRingNumber,releaseDate,arrivalDate,releaseLat,releaseLong,releaseCity,arriveLat,arriveLong,arriveCity);
        System.out.println(chipring);

        // Pigeon test
        Pigeon pigeon = new Pigeon(pidgeonBirthDate, ringNumber, chipring);
        System.out.println(pigeon);



    }
}