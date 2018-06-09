package ua.com.juja.edu.oopExample;

public class Main {



    public static void main(String[] args) {
        House house = new House(16, 4);

        Owner owner1 = new Owner("Ivan.Ivanov");
        Owner owner2 = new Owner("Lara.Ivanova");

        house.settle(owner1);
        house.settle(owner2);

        System.out.println(house.toString());
    }
}
