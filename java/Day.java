import java.util.Scanner;
class Day{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int days=scanner.nextInt();
		String day=scanner.nextLine();
		switch(days){
		case 1:
			day="Monday";
			break;
		case 2:
			day="Tuesday";
			break;
		case 3:
			day="Wednesday";
			break;
		case 4:
			day="Thursday";
			break;
		case 5:
			day="Friday";
			break;
		case 6:
			day="Saturday";
			break;
		case 7:
			day="Sunday";
			break;
		default:
			day="Invalid day number";
		}
		System.out.println("Day:" + day);
	}
}
