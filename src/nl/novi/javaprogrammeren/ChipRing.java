package nl.novi.javaprogrammeren;
import java.util.Date;
import java.lang.*;

public class ChipRing {
    private int chipRingNumber;
    private Date releaseDate;
    private Date arrivalDate;

    private double releaseLat;
    private double releaseLong;
    private String releaseCity;

    private double arriveLat;
    private double arriveLong;
    private String arriveCity;

    public ChipRing(int chipRingNumber, Date releaseDate, Date arrivalDate, double releaseLat, double releaseLong, String releaseCity, double arriveLat, double arriveLong, String arriveCity) {
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

    // calculate distance
    public double calcDistance() {
        double releaseLatRadians = Math.toRadians(releaseLat);
        double releaseLongRadians = Math.toRadians(releaseLong);
        double arriveLatRadians = Math.toRadians(arriveLat);
        double arriveLongRadians = Math.toRadians(arriveLong);

        double earthRadius = 6371.01; //Kilometers
        return earthRadius * Math.acos(Math.sin(releaseLatRadians)*Math.sin(arriveLatRadians) + Math.cos(releaseLatRadians)*Math.cos(arriveLatRadians)*Math.cos(releaseLongRadians - arriveLongRadians));
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

