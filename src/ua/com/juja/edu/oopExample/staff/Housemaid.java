package ua.com.juja.edu.oopExample.staff;

import ua.com.juja.edu.oopExample.Owner;
import ua.com.juja.edu.oopExample.apartment.Apartment;

public class Housemaid extends Owner implements Cleaner {

    public Housemaid(String name) {
        super(name);
    }

    @Override
    public void clean(Apartment apartment) {
        System.out.println("Cleaning apartment "+ apartment.getNumber());
        System.out.println("Cleaning done by "+ name);
    }
}
