import java.util.Scanner;

public class que15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        int sum = number / 100 + number / 10 % 10 + number % 10;
        System.out.println("Sum of digits: " + sum);
    }
}
