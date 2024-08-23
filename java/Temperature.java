import java.util.Scanner;
class Temperature{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Fahrenheit:");
		double fahrenheit=scanner.nextDouble();
		double celsius=(fahrenheit-32)*5/9;
		System.out.println("Fahrenheit:"  + fahrenheit + "\nFahrenheit to Celsius:" + celsius);
	}
}