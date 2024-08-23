import java.util.Scanner;
import java.util.Random;
class Guess{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        while (true){
            System.out.println("welcome to the guessing game");
            System.out.println("guess the number");
            int r=rand.nextInt(0,101);
            System.out.print("enter your guessing no:");
            int g=scan.nextInt();
            if(g==r){
                System.out.print("congradulations!Your guess is correct");
                break;
            }
            if(g>r){
                System.out.println("Too high!");
            }
            else if(g<r){
                System.out.println("Too  low!");
            }
            
            else{
                System.out.print("Wrong answer!");
            }
        }
    }
}