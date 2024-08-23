import java.util.Scanner;
class Mark{
	public static void main(String[] args){
        System.out.println("enter your mark:");
		Scanner student=new Scanner(System.in);
		int mark=student.nextInt();
		if(mark>=90)
			System.out.println("Grade:A");
		else if(mark<90 && mark>=80)
			System.out.println("Grade:B");
		else if(mark<80 && mark>=70)
			System.out.println("Grade:C");
		else if(mark<70 && mark>=60)
			System.out.println("Grade:D");
		else
			System.out.println("Fail");
	}
}
