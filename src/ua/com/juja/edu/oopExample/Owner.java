package ua.com.juja.edu.oopExample;

public class Owner {

    protected final String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner: "+ name;
    }
}
