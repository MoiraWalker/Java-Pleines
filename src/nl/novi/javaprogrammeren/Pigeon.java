package nl.novi.javaprogrammeren;

import java.util.Date;

public class Pigeon {
    private Date birthDate;
    private int ringNumber;
    private ChipRing ChipRing;

    public Pigeon(Date birthDate, int ringNumber, ChipRing ChipRing) {
        this.birthDate = birthDate;
        this.ringNumber = ringNumber;
        this.ChipRing = ChipRing;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getRingNumber() {
        return ringNumber;
    }

    public void setRingNumber(int ringNumber) {
        this.ringNumber = ringNumber;
    }

    public nl.novi.javaprogrammeren.ChipRing getChipRing() {
        return ChipRing;
    }

    public void setChipRing(nl.novi.javaprogrammeren.ChipRing chipRing) {
        ChipRing = chipRing;
    }

    @Override
    public String toString() {
        return "Pigeon { " + "\n" +
                "\t\t" + "Birthdate pidgeon: " + birthDate + "\n" +
                "\t\t" + "Ringnumber: " + ringNumber + "\n" +
                "\t\t" + "Chipring: " + ChipRing + "\n" +
                '}';
    }
}
