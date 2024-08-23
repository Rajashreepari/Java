import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);
        int mark = student.nextInt();
        if (mark >= 90)
            System.out.println("Grade: A");
        else if (mark >= 75 && mark < 90)
            System.out.println("Grade: B");
        else if (mark >= 55 && mark < 75)
            System.out.println("Grade: C");
        else if (mark > 40 && mark < 55)
            System.out.println("Grade: D");
        else
            System.out.println("Fail");
    }
}
