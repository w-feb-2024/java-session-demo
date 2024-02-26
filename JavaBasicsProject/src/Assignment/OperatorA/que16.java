import java.util.Scanner;

public class que16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        int reversedNumber = (number % 10) * 100 + (number / 10 % 10) * 10 + number / 100;
        System.out.println("Reversed number: " + reversedNumber);
    }
}
