import java.util.Scanner;
public class Password{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Correct Password:");
		String correct_password=scanner.nextLine();
		while(true){
			System.out.print("Enter password:");
			String entered_password=scanner.nextLine();
			if(entered_password.equals(correct_password)){
				System.out.println("Password Accepted");
				break;
			}
			else{
				System.out.println("Incorrect Password.Tryagain.");
			}
		}
	}
}