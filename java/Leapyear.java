import java.util.Scanner;
class Leapyear{
	public static void main(String[] args){
		Scanner record=new Scanner(System.in);
		System.out.print("Enter a year:");
		int year= record.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println(year + " is leap year");
		else
			System.out.println(year + " is not a leap year");
	}
}
