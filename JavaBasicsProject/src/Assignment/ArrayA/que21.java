// 21. Write a program to array elements to print sum of Negative Numbers
// Sample Output
// Array = {10, -23, 45, -10, 30}
// Sum of Negative Array Elements = -33

import java.util.ArrayList;
import java.util.Scanner;

public class que21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }

        int sum = sumOfnegativeNumbers(arrayList);
        System.out.println("Sum of Negative Array Elements = " + sum);
    }

    public static int sumOfnegativeNumbers(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int num : arrayList) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }
}
