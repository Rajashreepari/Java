import java.util.Random;
import java.util.Scanner;
class Multiplication_quiz{
    public static void main(String[] args){
        System.out.println("Welcome to multiplication practice program!");
        Random num=new Random();
        Scanner user=new Scanner(System.in);
        System.out.print("Enter limit:");
        int limit=user.nextInt();
        while (true){
            int n1=num.nextInt(limit)+1;
            int n2=num.nextInt(limit)+1;
            int product=n1*n2;
            System.out.println("What is "+n1+" * "+n2+ " ?");
            System.out.print("Enter your answer (or 0 to exit):");
            int answer=user.nextInt();
            if (answer==0){
                System.out.print("Thankyou for practicing multiplication!");
                break;
            }
            else if (answer==product){
                System.out.print("Correct!");
            }
            else{
                System.out.print("Incorrect. The correct answer is "+ product+".");
            }
            
        }
    }
}