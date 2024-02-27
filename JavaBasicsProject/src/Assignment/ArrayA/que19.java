// 19. Write a program to array elements print all Negative number
// Sample Output
// Array = {-45, 32, -7, 3, -6}
// Negative Array Elements = {-45, -7, -6}
import java.util.ArrayList;
import java.util.Scanner;

public class que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        // Taking input for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }

        // Finding positive numbers
        ArrayList<Integer> negativearr = negativearrList(arr);

        // Displaying positive numbers
        System.out.println("negativearr Array Elements = " + negativearr);
    }

    public static ArrayList<Integer> negativearrList(ArrayList<Integer> arr) {
        ArrayList<Integer> negativearr = new ArrayList<>();
        for (int num : arr) {
            if (num > 0) {
                negativearr.add(num);
            }
        }
        return negativearr;
    }
}
