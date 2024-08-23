import java.util.Scanner;
class Vote{
   public static void main(String[] args){
       System.out.println("enter your age:");
       Scanner Person=new Scanner(System.in);
       int age=Person.nextInt();
       if (age>=18)
          System.out.println("You are Eligible to vote.");
       else
          System.out.println("You are not Eligible to vote.");
   }
}
