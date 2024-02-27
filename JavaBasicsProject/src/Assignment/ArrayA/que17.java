import java.util.Scanner;
import java.util.Arrays;

public class que17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("First Array = " + Arrays.toString(arr1));
        System.out.println("Second Array = " + Arrays.toString(arr2));
        System.out.println("Merged Array = " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy elements of first array
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);

        // Copy elements of second array
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        return mergedArray;
    }
}
