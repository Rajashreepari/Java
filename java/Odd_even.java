import java.util.Scanner;
class Odd_even {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int num = obj.nextInt();
      if (num % 2 == 0)
         System.out.println("even:" + num);
      else
         System.out.println("Odd:" + num);
   }
}