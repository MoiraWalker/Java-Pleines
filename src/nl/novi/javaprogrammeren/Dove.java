package nl.novi.javaprogrammeren;

import java.util.Date;

public class Dove {
    private String name;
    private String ringNumber;
    private Date birthDate;

    public Dove(String name, String ringNumber, Date birthDate) {
        this.name = name;
        this.ringNumber = ringNumber;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }


    @Override
    public String toString() {
        return "Dove { " + "\n" +
                "\t\t" + "name: " + name + "\n" +
                "\t\t" + "Ringnumber: " + ringNumber + "\n" +
                "\t\t" + "Birthdate: " + birthDate + "\n" +
                '}';
    }
}
