package ua.com.juja.edu.oopExample;

import ua.com.juja.edu.oopExample.apartment.LivingApartment;
import ua.com.juja.edu.oopExample.staff.Cleaner;


public class House {

    private Floor[] floors;
    private Cleaner[] cleaners;

    public House(int floorsCount, int apartmentsOnFloor) {
        NumberGenerator numbers = new NumberGenerator();
        floors = new Floor[floorsCount];
        cleaners = new Cleaner[floorsCount];
        for (int index = 0; index < floorsCount; index++) {
            floors[index] = new Floor(index + 1, apartmentsOnFloor, numbers);
        }
    }


    public void settle(Owner owner) {
        for (Floor floor : floors) {
            LivingApartment apartment = floor.getFreeApartment();
            if (apartment != null) {
                apartment.addOwner(owner);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String result = "House: \n";
        for (Floor floor : floors) {
            result += floor.toString() + "\n";
        }
        return result;
    }

    public void addCleaner(Cleaner cleaner) {
        int floor = nextCleanerPlace();
        this.cleaners[floor] = cleaner;
        this.floors[floor].setCleaner(cleaner);
    }

    private int nextCleanerPlace() {
        for (int index = 0; index < cleaners.length; index++) {
            if (cleaners[index] == null) {
                return index;
            }
        }
        throw new RuntimeException("No place for new cleaner");
    }
}
