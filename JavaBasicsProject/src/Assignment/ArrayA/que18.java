import java.util.ArrayList;
import java.util.Scanner;

public class que18 {
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
        ArrayList<Integer> positivearr = positivearrList(arr);

        // Displaying positive numbers
        System.out.println("Positive Array Elements = " + positivearr);
    }

    public static ArrayList<Integer> positivearrList(ArrayList<Integer> arr) {
        ArrayList<Integer> positivearr = new ArrayList<>();
        for (int num : arr) {
            if (num > 0) {
                positivearr.add(num);
            }
        }
        return positivearr;
    }
}
