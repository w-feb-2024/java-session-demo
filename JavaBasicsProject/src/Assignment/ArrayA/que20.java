// 20. Write a program to array elements to print sum of Positive Numbers
// Sample Output
// Array = {1, -2, 3, 3, 4}
// Sum of Positive Array Elements = 7
import java.util.ArrayList;
import java.util.Scanner;

public class que20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }

        int sum = sumOfPositiveNumbers(arrayList);
        System.out.println("Sum of Positive Array Elements = " + sum);
    }

    public static int sumOfPositiveNumbers(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int num : arrayList) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }
}
