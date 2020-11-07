package nl.novi.javaprogrammeren;

import java.util.Date;

public class Dove {
    private Date birthDate;
    private String ringNumber;
    private ChipRing chipRing;

    public Dove(Date birthDate, String ringNumber, ChipRing chipRing) {
        this.birthDate = birthDate;
        this.ringNumber = ringNumber;
        this.chipRing = chipRing;
    }

    @Override
    public String toString() {
        return "Dove { " + "\n" +
                "\t\t" + "Birthdate dove: " + birthDate + "\n" +
                "\t\t" + "Ringnumber: " + ringNumber + "\n" +
                "\t\t" + "Chipring: " + chipRing + "\n" +
                '}';
    }
}
