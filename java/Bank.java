import java.util.Scanner;
class Bank{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Current balance:");
		double current_balance=scanner.nextDouble();
		System.out.print("\nwithdrawal amount:");
		int withdrawal_amount=scanner.nextInt();
		if(withdrawal_amount<current_balance)
			System.out.println("withdrawal successful.New balance:" + (current_balance-withdrawal_amount));
		else
			System.out.println("Error:Insufficient balance");
	}
}
