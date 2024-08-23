import java.util.Scanner;

class Sum_natural_number {
   public static void main(String[] args) {
      System.out.print("enter number:");
      Scanner natural = new Scanner(System.in);
      int num = natural.nextInt();
      int sum = 1;
      for (int i = 1; i <= num; i++) {
         sum += 1;
      }
      System.out.print("\n Sum of " + num + " Natural number is " + sum);
   }
}