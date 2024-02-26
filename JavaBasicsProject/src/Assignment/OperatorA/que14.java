import java.util.Scanner;

public class que14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        int digit1 = (number / 1000 + 2) % 10;
        int digit2 = (number / 100 % 10 + 2) % 10;
        int digit3 = (number / 10 % 10 + 2) % 10;
        int digit4 = (number % 10 + 2) % 10;

        int result = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
        System.out.println("Result: " + result);
    }
}
