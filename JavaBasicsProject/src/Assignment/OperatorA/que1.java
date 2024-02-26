import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth of rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area and perimeter
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        // Display results
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}
