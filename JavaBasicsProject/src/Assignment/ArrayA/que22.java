import java.util.Scanner;

public class que22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        searchElementInArray(array, searchElement);
    }

    public static void searchElementInArray(int[] array, int searchElement) {
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                position = i + 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element is Found in the Position = " + position);
            System.out.println("Element is Found in the Index = " + (position - 1));
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
