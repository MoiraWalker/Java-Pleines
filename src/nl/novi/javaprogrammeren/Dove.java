package nl.novi.javaprogrammeren;

import java.util.Date;

public class Dove {
    private Date birthDate;
    private int ringNumber;
    private int ChipRing;

    public Dove(Date birthDate, int ringNumber, ChipRing chipRing) {
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

    public int getChipRing() {
        return ChipRing;
    }

    public void setChipRing(int chipRing) {
        ChipRing = chipRing;
    }

    @Override
    public String toString() {
        return "Dove { " + "\n" +
                "\t\t" + "Birthdate dove: " + birthDate + "\n" +
                "\t\t" + "Ringnumber: " + ringNumber + "\n" +
                "\t\t" + "Chipring: " + ChipRing + "\n" +
                '}';
    }
}
