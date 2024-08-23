import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private static int totalStudentsEnrolled = 0;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudentsEnrolled++;
    }

    public static int getTotalStudentsEnrolled() {
        return totalStudentsEnrolled;
    }

    public void SetGrade(int inputGrade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SetGrade'");
    }

    public String getGrade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGrade'");
    }
}

class Course {
    private String title;
    private String code;
    private static int totalCoursesOffered = 0;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        totalCoursesOffered++;
    }

    public static int getTotalCoursesOffered() {
        return totalCoursesOffered;
    }
}

public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students to enroll: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            new Student(name, id);
        }
        System.out.print("Enter the number of courses to offer: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter details for Course " + (i + 1));
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Code: ");
            String code = scanner.nextLine();
            new Course(title, code);
        }

        System.out.println("Total Students Enrolled: " + Student.getTotalStudentsEnrolled());
        System.out.println("Total Courses Offered: " + Course.getTotalCoursesOffered());
    }
}
