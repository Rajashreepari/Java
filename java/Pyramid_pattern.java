import java.util.Scanner;

class Pyramid_pattern {
    public static void main(String[] args) {
        System.out.print("enter rows:");
        Scanner pattern = new Scanner(System.in);
        int row = pattern.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
                k = k + (row - i) / i;
            }
            System.out.println();
        }
    }
}