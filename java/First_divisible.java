import java.util.Scanner;
class First_divisible{
    public static void main(String[] args){
        Scanner divisible=new Scanner(System.in);
        System.out.print("enter limit:");
        int limit=divisible.nextInt();
        System.out.print("Enter divisor:");
        int divisor=divisible.nextInt();
        for(int i=1;i<=limit;i++){
            if(i%divisor==0){
                System.out.println("The first number divisible by "+divisor+ " is "+ i);
                break;
            }
        }
        
    }
}