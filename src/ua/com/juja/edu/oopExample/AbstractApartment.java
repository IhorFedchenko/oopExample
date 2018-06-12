package ua.com.juja.edu.oopExample;

public abstract class AbstractApartment {
    private int number;

    public AbstractApartment(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " number " + number + "\n";
    }

    public boolean isFree() {
        return false;
    }
}
