package ua.com.juja.edu.oopExample.staff;

import ua.com.juja.edu.oopExample.apartment.Apartment;

public class RoboCleaner implements Cleaner {
    private String nick;

    public RoboCleaner(String nick) {
        this.nick = nick;
    }

    @Override
    public void clean(Apartment apartment) {
        System.out.println("RoBoBoBo "+ nick + " Cleaning...");
        System.out.println("Done!");
    }
}
