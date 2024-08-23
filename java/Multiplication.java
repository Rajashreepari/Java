import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        System.out.print("enter rows:");
        Scanner table = new Scanner(System.in);
        int num = table.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}