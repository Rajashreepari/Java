import java.util.Scanner;
class Exam{
   public static void main(String[] args){
     System.out.println("enter your mark:");
     Scanner std=new Scanner(System.in);
     int mark=std.nextInt();
     System.out.println((mark>=50)? "Pass" : "fail");
   }
}
     