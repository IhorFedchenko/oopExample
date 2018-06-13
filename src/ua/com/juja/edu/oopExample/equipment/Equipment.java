package ua.com.juja.edu.oopExample.equipment;

public abstract class Equipment {
    @Override
    public String toString() {
        return "Equipment " + this.getClass().getSimpleName();
    }
}
