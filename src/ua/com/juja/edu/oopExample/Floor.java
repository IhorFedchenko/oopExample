package ua.com.juja.edu.oopExample;

public class Floor {
    private static final int DEFAULТ_APARTMENT_CAPACITY = 4;
    private int number;
    private LivingApartment[] apartments;

    public Floor(int number, int apartmentsCount, NumberGenerator numbers) {
        this.number = number;

        this.apartments = new LivingApartment[apartmentsCount];
        for (int index = 0; index < apartmentsCount; index++) {
            apartments[index] = new LivingApartment(numbers.getNext(), DEFAULТ_APARTMENT_CAPACITY);
        }
    }


    public LivingApartment getFreeApartment() {
        for (LivingApartment apartment : apartments){
            if (apartment.isFree()){
                return apartment;
            }
        }
        return null; //TODO implement me
    }

    @Override
    public String toString() {
        String result = "====================\n";
        result += "Floor number " + number + "\n";
        result += "-------------------------\n";
        for (LivingApartment apartment : apartments) {
            result += apartment.toString() + "\n";
        }
        result += "====================\n";
        return result;

    }
}
