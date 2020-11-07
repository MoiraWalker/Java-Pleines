package nl.novi.javaprogrammeren;

import java.util.ArrayList;
import java.util.List;

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
    private Dove dove;

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
        this.dove = dove;
    }

    public Boolean addDove(Dove dove) {
        return doveList.add(dove);
    }

    public void removeDove(Dove dove) {
         doveList.remove(dove);
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
}