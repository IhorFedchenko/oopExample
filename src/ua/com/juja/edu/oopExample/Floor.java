package ua.com.juja.edu.oopExample;

import ua.com.juja.edu.oopExample.apartment.Apartment;
import ua.com.juja.edu.oopExample.apartment.LivingApartment;
import ua.com.juja.edu.oopExample.apartment.TechnicalApartment;
import ua.com.juja.edu.oopExample.staff.Cleaner;

public class Floor {
    private static final int DEFAULТ_APARTMENT_CAPACITY = 4;
    private int number;
    private Apartment[] apartments;
    private Cleaner cleaner;

    public Floor(int number, int apartmentsCount, NumberGenerator numbers) {
        this.number = number;

        this.apartments = new Apartment[apartmentsCount];
        this.apartments[0] = new TechnicalApartment(numbers.getNext());
        for (int index = 1; index < apartmentsCount; index++) {
            apartments[index] = new LivingApartment(numbers.getNext(), DEFAULТ_APARTMENT_CAPACITY);
        }
    }


    public LivingApartment getFreeApartment() {
        for (Apartment apartment : apartments){
            if (apartment instanceof LivingApartment && apartment.isFree()){
                cleaner.clean(apartment);
                return (LivingApartment) apartment;
            }
        }
        return null; //TODO implement me
    }

    @Override
    public String toString() {
        String result = "====================\n";
        result += "Floor number " + number + "\n";
        result += "-------------------------\n";
        for (Apartment apartment : apartments) {
            result += apartment.toString() + "\n";
        }
        result += "====================\n";
        return result;

    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }
}
