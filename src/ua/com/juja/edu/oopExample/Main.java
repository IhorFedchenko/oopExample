package ua.com.juja.edu.oopExample;

public class Main {



    public static void main(String[] args) {
        House house = new House(16, 4);

        Owner owner1 = new Owner("Adam.Ivanov");
        Owner owner2 = new Owner("Eva.Ivanova");
        Owner owner3 = new Owner("Kain.Ivanov");
        Owner owner4 = new Owner("Avel.Ivanov");
        Owner owner5 = new Owner("Avraam.Avramenko");
        Owner owner6 = new Owner("Sara.Avramenko");
        Owner owner7 = new Owner("Jack.Avramenko");

        house.settle(owner1);
        house.settle(owner2);
        house.settle(owner3);
        house.settle(owner4);
        house.settle(owner5);
        house.settle(owner6);
        house.settle(owner7);

        System.out.println(house.toString());

    }
}
