 import java.util.Scanner;
 class Student {
    private String name;
    private double homeworkGrade;
    private double finalExamGrade;

    public Student(String name, double homeworkGrade, double finalExamGrade) {
        this.name = name;
        this.homeworkGrade = homeworkGrade;
        this.finalExamGrade = finalExamGrade;
    }

    public String getName() {
        return name;
    }

    public double getHomeworkGrade() {
        return homeworkGrade;
    }

    public double getFinalExamGrade() {
        return finalExamGrade;
    }

    public double getAverageGrade() {
        return (homeworkGrade + finalExamGrade) / 2;
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Homework Grade: ");
        double homeworkGrade = scanner.nextDouble();

        System.out.print("Final Exam Grade: ");
        double finalExamGrade = scanner.nextDouble();

        Student student = new Student(name, homeworkGrade, finalExamGrade);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Homework Grade: " + student.getHomeworkGrade());
        System.out.println("Final Exam Grade: " + student.getFinalExamGrade());
        System.out.println("Average Grade: " + student.getAverageGrade());
        
        scanner.close();
    }
}