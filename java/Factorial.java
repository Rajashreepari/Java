import java.util.Scanner;

class Factorial {
   public static void main(String[] args) {
      System.out.print("enter number:");
      Scanner series = new Scanner(System.in);
      int num = series.nextInt();
      int i = 1;
      int fact = 1;
      for (i = 1; i <= num; i++) {
         fact = fact * i;
      }
      System.out.print("\n Factorial of " + num + " is " + fact);
   }
}