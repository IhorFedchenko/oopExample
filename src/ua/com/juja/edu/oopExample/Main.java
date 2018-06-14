package ua.com.juja.edu.oopExample;

import ua.com.juja.edu.oopExample.staff.Housemaid;
import ua.com.juja.edu.oopExample.staff.RoboCleaner;

public class Main {



    public static void main(String[] args) {
        House house = new House(8, 4);

        Owner owner1 = new Owner("Adam.Ivanov");
        Owner owner2 = new Owner("Eva.Ivanova");
        Owner owner3 = new Owner("Kain.Ivanov");
        Owner owner4 = new Owner("Avel.Ivanov");
        Owner owner5 = new Owner("Avraam.Avramenko");
        Owner owner6 = new Owner("Sara.Avramenko");
        Owner owner7 = new Owner("Jack.Avramenko");

        Housemaid housemaid = new Housemaid("Eva.Uborovna");

        house.addCleaner(housemaid);
        house.addCleaner(housemaid);
        house.addCleaner(new RoboCleaner("nick001"));
        house.addCleaner(new RoboCleaner("nick002"));
        house.addCleaner(new RoboCleaner("nick003"));
        house.addCleaner(new RoboCleaner("nick004"));
        house.addCleaner(new RoboCleaner("nick005"));
        house.addCleaner(new RoboCleaner("nick006"));

        house.settle(owner1);
        house.settle(owner2);
        house.settle(owner3);
        house.settle(owner4);
        house.settle(owner5);
        house.settle(owner6);
        house.settle(housemaid);

        System.out.println(house.toString());

    }
}
