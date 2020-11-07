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




    public Boolean addDove(Dove dove) {
        return doveList.add(dove);
    }

    public Boolean removeDove(Dove dove) {
        return doveList.add(dove);
    }

    public void getFirstName(Dove dove) {
         doveList.remove(dove);
    }

    public void deleteAllDoves() {
        doveList.clear();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouseNumberAddition() {
        return houseNumberAddition;
    }

    public void setHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public boolean isContributionPaid() {
        return isContributionPaid;
    }

    public void setContributionPaid(boolean contributionPaid) {
        isContributionPaid = contributionPaid;
    }

    public int getTotalContestPoints() {
        return totalContestPoints;
    }

    public void setTotalContestPoints(int totalContestPoints) {
        this.totalContestPoints = totalContestPoints;
    }

    public List<Dove> getDoveList() {
        return doveList;
    }

    public void setDoveList(List<Dove> doveList) {
        this.doveList = doveList;
    }
}