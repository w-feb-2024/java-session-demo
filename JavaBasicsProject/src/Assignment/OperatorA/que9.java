import java.text.DecimalFormat;

public class que9 {
    public static void main(String[] args) {
        int marks1 = 78;
        int marks2 = 45;
        int marks3 = 62;

        // Calculate total marks
        int totalMarks = marks1 + marks2 + marks3;

        // Calculate percentage marks
        double percentage = (double) totalMarks / 3;

        // Display total marks and percentage
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage marks: " + new DecimalFormat("0.00").format(percentage) + "%");
    }
}
