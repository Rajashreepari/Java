import java.util.Scanner;
class Odd{
    public static void main(String[] args){
        System.out.print("Enter number:");
        Scanner number=new Scanner(System.in);
        int num=number.nextInt();
        System.out.println("Odd numbers from 1 to "+num+" :");
        for(int i=1;i<=num;i++){
            if (i%2!=0)
               System.out.print(i);
            System.out.print(" ");
        }
    }
}