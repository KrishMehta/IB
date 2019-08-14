package Ferry;

/**
 * Class created by Krish
 */

public class Car {

    private String model;
    private String make;
    private String color;
    private int id;

    public Car(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ferry.Car{id='" + id + "\'}";
    }

}
