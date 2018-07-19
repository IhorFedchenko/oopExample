package ua.com.juja.edu.oopExample.apartment.printer;

import ua.com.juja.edu.oopExample.Owner;
import ua.com.juja.edu.oopExample.apartment.LivingApartment;

public class SimpleTextPrinter implements Printer {


    @Override
    public String print(LivingApartment livingApartment) {
        String result = super.toString();
        String[] owners = livingApartment.getOwners();
        for (int index = 0; index < livingApartment.getOwners().length; index++) {
            String owner = owners[index];

            if (owner != null) {
                result += "**************\n";
                result += "Owner: " + owner.toString() + "\n";
                result += "**************\n";
            }
        }
        return result;
    }
}