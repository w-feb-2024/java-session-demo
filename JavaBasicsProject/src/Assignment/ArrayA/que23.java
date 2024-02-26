import java.util.ArrayList;
import java.util.Scanner;

public class que23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        removeDuplicatesFromArray(array);
    }

    public static void removeDuplicatesFromArray(int[] array) {
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (int num : array) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
            }
        }

        System.out.println("After Remove Duplicate Array Elements = " + uniqueElements);
    }
}
