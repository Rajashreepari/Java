import java.util.Scanner;

public class Studentgrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grades = new int[3][4];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            System.out.print("Math: ");
            grades[i][0] = scanner.nextInt();
            System.out.print("Science: ");
            grades[i][1] = scanner.nextInt();
            System.out.print("English: ");
            grades[i][2] = scanner.nextInt();
            System.out.print("Tamil: ");
            grades[i][3] = scanner.nextInt();
        }
        printGrades(grades);
        printAverageGrades(grades);

        scanner.close();
    }

    public static void printGrades(int[][] grades) {
        System.out.println("Grades of all students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": Math: " + grades[i][0] + ", Science: " + grades[i][1] + ","
                    + "English:" + grades[i][2] + "," + "Tamil:" + grades[i][3]);
        }
    }

    public static void printAverageGrades(int[][] grades) {
        double totalMath = 0;
        double totalScience = 0;
        double totalEnglish = 0;
        double totalTamil = 0;

        for (int i = 0; i < grades.length; i++) {
            totalMath += grades[i][0];
            totalScience += grades[i][1];
            totalEnglish += grades[i][2];
            totalTamil += grades[i][3];
        }

        double averageMath = totalMath / grades.length;
        double averageScience = totalScience / grades.length;
        double averageEnglish = totalEnglish / grades.length;
        double averageTamil = totalTamil / grades.length;

        System.out.println("Average Math grade: " + averageMath);
        System.out.println("Average Science grade: " + averageScience);
        System.out.println("Average English grade:" + averageEnglish);
        System.out.println("Average Tamil grade:" + averageTamil);
    }
}