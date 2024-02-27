
// Circle Class
// Create a class to represent a Circle type in java, which should have following :
// radius. Instance field of type double
// No-argument constructor. Set radius with default value of 1.0
// Constructor. that accept an argument for radius
// getRadius. public method that returns the radius of Circle
// getArea. Method that returns the area of Circle


public class Circle {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0; // default value
    }

    // Constructor with parameter for radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to get the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
