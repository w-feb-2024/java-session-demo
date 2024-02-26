import java.util.Scanner;

public class Question1 {
    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int total = getTotal(num1, num2);
        System.out.println("Total: " + total);
    }
}
