public class que12 {
    public static void main(String[] args) {
        int totalStudents = 90;
        // int boys = 45;
        int boysWithGradeA = 20;

        int girlsWithGradeA = (int) (totalStudents * 0.5 - boysWithGradeA);
        System.out.println("Total girls getting grade 'A': " + girlsWithGradeA);
    }
}
