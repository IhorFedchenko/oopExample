package ua.com.juja.edu.oopExample.apartment;

import ua.com.juja.edu.oopExample.Owner;

public class LivingApartment extends Apartment {

    private Owner[] owners;

    public LivingApartment(int number, int capacity) {
        super(number);
        this.owners = new  Owner[capacity];
    }

    public void addOwner(Owner owner) {
        owners[getFreeRoomIndex()] =  owner;
    }

    @Override
    public String toString() {
        String result = super.toString();
        for (int index = 0; index < owners.length ; index++) {
            if (owners[index] != null){
                result += "**********\n";
                result += "Owner: " + owners[index].toString() +"\n";
                result += "**********\n";
            }
        }

        return result;
    }

    private int getFreeRoomIndex() {
        for (int index = 0; index <owners.length ; index++) {
            if (owners[index] == null) {
                return index;
            }
        }
        throw new RuntimeException("No free rooms for owner!!!");
    }
    @Override
    public boolean isFree() {
        return  owners[owners.length-1] == null;
    }
}
