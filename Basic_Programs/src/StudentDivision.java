public class StudentDivision {

    void calculateDivision(int m1, int m2, int m3, int m4, int m5) {

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 500.0 * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 60) {
            System.out.println("First Division");
        } else if (percentage >= 50) {
            System.out.println("Second Division");
        } else if (percentage >= 40) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        StudentDivision obj = new StudentDivision();
        obj.calculateDivision(70, 65, 80, 75, 60);
    }
}
