import java.util.Scanner;

public class Managegrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grades = new int[5][2];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            System.out.print("Math: ");
            grades[i][0] = scanner.nextInt();
            System.out.print("Science: ");
            grades[i][1] = scanner.nextInt();
        }
        printGrades(grades);
        printAverageGrades(grades);

        scanner.close();
    }
    public static void printGrades(int[][] grades) {
        System.out.println("Grades of all students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": Math: " + grades[i][0] + ", Science: " + grades[i][1]);
        }
    }
    public static void printAverageGrades(int[][] grades) {
        double totalMath = 0;
        double totalScience = 0;

        for (int i = 0; i < grades.length; i++) {
            totalMath += grades[i][0];
            totalScience += grades[i][1];
        }

        double averageMath = totalMath / grades.length;
        double averageScience = totalScience / grades.length;

        System.out.println("Average maths grade: " + averageMath);
        System.out.println("Average Science grade: " + averageScience);
    }
}