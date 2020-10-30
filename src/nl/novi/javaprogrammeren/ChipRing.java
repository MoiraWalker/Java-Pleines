package nl.novi.javaprogrammeren;

import java.util.Date;


public class ChipRing {
    private String chipRingNumber;
    private Date releaseDate;
    private Date arrivalDate;

    private long releaseLat;
    private long releaseLong;
    private String releaseCity;

    private long arriveLat;
    private long arriveLong;
    private String arriveCity;

    public ChipRing(String chipRingNumber, Date releaseDate, Date arrivalDate, long releaseLat, long releaseLong, String releaseCity, long arriveLat, long arriveLong, String arriveCity) {
        this.chipRingNumber = chipRingNumber;
        this.releaseDate = releaseDate;
        this.arrivalDate = arrivalDate;
        this.releaseLat = releaseLat;
        this.releaseLong = releaseLong;
        this.releaseCity = releaseCity;
        this.arriveLat = arriveLat;
        this.arriveLong = arriveLong;
        this.arriveCity = arriveCity;
    }

    public long calcDistance(){
        long distance = (long) Math.sqrt(Math.pow(releaseLong - releaseLat, 2) + Math.pow(arriveLong - arriveLat,2));
        return distance;
    }

    public long calcReleaseTime() {
        return releaseDate.getTime();
    }

    public long calcArrivalTime() {
        return arrivalDate.getTime();
    }

    public long calcFlightTime(){
        long releaseTime = calcReleaseTime();
        long arrivalTime = calcArrivalTime();
        long flightTime =  arrivalTime - releaseTime;
        return flightTime;
    }

    @Override
    public String toString() {
        return "ChipRing { " + "\n" +
                "\t\t" + "Chipring number: " + chipRingNumber + "\n" +
                "\t\t" + "Release city: " + releaseCity + "\n" +
                "\t\t" + "Arrive city: " + arriveCity + "\n" +
                "\t\t" + "Flight time: " + calcFlightTime() + " miliseconds" + "\n" +
                "\t\t" + "Distance flown: " + calcDistance() + "km" + "\n" +
                '}';
    }
}

