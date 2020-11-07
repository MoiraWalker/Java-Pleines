package nl.novi.javaprogrammeren;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class ClubMember {
    private String firstName;
    private String lastName;

    private String street;
    private String postcode;
    private String houseNumberAddition;
    private String city;
    private double cityLat;
    private double cityLong;

    private String email;
    private String phoneNumber;
    private int memberId;

    private boolean isContributionPaid;
    private int totalContestPoints;

    private List<Dove> doveList;
    public Dove dove;

    public ClubMember(String firstName, String lastName, String street, String postcode, String houseNumberAddition, String city, double cityLat, double cityLong, String email, String phoneNumber, int memberId, boolean isContributionPaid, int totalContestPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.postcode = postcode;
        this.houseNumberAddition = houseNumberAddition;
        this.city = city;
        this.cityLat = cityLat;
        this.cityLong = cityLong;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.memberId = memberId;
        this.isContributionPaid = isContributionPaid;
        this.totalContestPoints = totalContestPoints;
        this.doveList = new ArrayList<>();
    }

    public void createDove(String name, String ringNumber, Date birthDate) {
        Dove dove = new Dove(name, ringNumber, birthDate);
        doveList.add(dove);
    }

    public void removeDove(String ringNumber) {
        Iterator<Dove> itr = doveList.iterator();
        while (itr.hasNext()) {
            Dove dove = itr.next();
            if (dove.getRingNumber().equalsIgnoreCase(ringNumber)){
                itr.remove();
            }
        }
    }

    public void deleteAllDoves() {
        doveList.clear();
    }

    public List<Dove> getDoveList() {
        return doveList;
    }

    public void setDoveList(List<Dove> doveList) {
        this.doveList = doveList;
    }

    public boolean isContributionPaid() {
        return isContributionPaid;
    }

    public void setContributionPaid(boolean contributionPaid) {
        isContributionPaid = contributionPaid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getCityLat() {
        return cityLat;
    }

    public void setCityLat(double cityLat) {
        this.cityLat = cityLat;
    }

    public double getCityLong() {
        return cityLong;
    }

    public void setCityLong(double cityLong) {
        this.cityLong = cityLong;
    }
}