import java.util.Scanner;

class Pascal {
    public static void main(String[] args) {
        System.out.print("enter rows:");
        Scanner triangle = new Scanner(System.in);
        int row = triangle.nextInt();
        for (int line = 0; line < row; line++) {
            for (int j = 0; j < row - line; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int i = 0; i <= line; i++) {
                System.out.print(k + " ");
                k = k * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }
}