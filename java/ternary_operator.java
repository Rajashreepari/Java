import java.util.Scanner;

public class ternary_operator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n >= 50 ? "pass" : "fail");
    }
}
