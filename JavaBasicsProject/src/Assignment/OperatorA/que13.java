import java.util.Scanner;

public class que13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        int sum = number % 10 + number / 10000;
        System.out.println("Sum of first and second last digit: " + sum);
    }
}
