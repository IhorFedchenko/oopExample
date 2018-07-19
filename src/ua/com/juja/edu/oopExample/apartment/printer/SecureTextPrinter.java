package ua.com.juja.edu.oopExample.apartment.printer;

import ua.com.juja.edu.oopExample.apartment.LivingApartment;

public class SecureTextPrinter implements Printer {


    @Override
    public String print(LivingApartment livingApartment) {
        String result = ""; //TODO implement me
        result += (livingApartment.isFree())?"is free": "is not free\n";
        return result;
    }
}