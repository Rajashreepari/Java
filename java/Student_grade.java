import java.util.Scanner;

public class Student_grade {
    private static int grade;

    public Student_grade() {
        this.grade = 0;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Invalid grade. Please enter a value between 0 and 100.");
        }
    }

    public int getGrade() {
        return this.grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(null, grade);
        boolean running = true;

        while (running) {
            System.out.println("\nStudent Grade Management System");
            System.out.println("1. Set Grade");
            System.out.println("2. Show Grade");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's grade (0 to 100): ");
                    int inputGrade = scanner.nextInt();
                    student.SetGrade(inputGrade);
                    break;

                case 2:
                    System.out.println("The student's grade is: " + student.getGrade());
                    break;

                case 3:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Error: Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }
}
