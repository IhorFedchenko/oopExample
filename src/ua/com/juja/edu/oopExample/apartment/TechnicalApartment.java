package ua.com.juja.edu.oopExample.apartment;

import ua.com.juja.edu.oopExample.equipment.Bucket;
import ua.com.juja.edu.oopExample.equipment.Equipment;
import ua.com.juja.edu.oopExample.equipment.Extinguisher;
import ua.com.juja.edu.oopExample.equipment.Swob;

import java.util.Arrays;

public class TechnicalApartment extends Apartment {

    private  Equipment[] equipments;

    public TechnicalApartment(int number) {
        super(number);
        equipments = new Equipment[10];
        equipments[0] = new Extinguisher();
        equipments[1] = new Bucket();
        equipments[2] = new Swob();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "With objects: " + Arrays.toString(equipments);
    }
}
