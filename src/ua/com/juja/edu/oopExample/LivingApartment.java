package ua.com.juja.edu.oopExample;

public class LivingApartment extends AbstractApartment {

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

    public int getFreeRoomIndex() {
        for (int index = 0; index <owners.length ; index++) {
            if (owners[index] == null) {
                return index;
            }
        }
        throw new RuntimeException("No free rooms for owner!!!");
    }

    public boolean isFree() {
        return  owners[owners.length-1] == null;
    }
}
