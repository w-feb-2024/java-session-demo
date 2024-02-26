
// Car Class
// Create a new class named Car that has the following fields:
// year - The year field is an int that holds a car's year model (e.g. 2015)
// make - The make field is a String object that holds the make of the car (e.g. "Honda")
// speed - The speed field is an double that holds a car's maximum speed (e.g. 85.0)
// In addition, the Car class should have the following methods.
// Constructor - The constructor should accept the car's year, make, and beginning speed as arguments
// These values should be used to initialize the Car's year, make, and speed fields
// Getter Methods - Write three accessor (getter) methods to get the values stored in an object's fields getYear(), getMake(), getSpeed()

public class Car {
    private int year;
    private String make;
    private double speed;

    // Constructor
    public Car(int year, String make, double speed) {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;
    }
}
