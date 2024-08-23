import java.util.Scanner;
class BMI_calculator{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a weight in kilogram:");
		double weight=scanner.nextDouble();
		System.out.print("Enter a height in metre:");
		double height=scanner.nextDouble();
		System.out.println("Weight:" + weight + "kg" + "," + "Height:" + height + "m");
		double BMI=weight/(height*height);
		if(BMI<18.5)
			System.out.println("BMI:" + BMI + "," + "Category:Under weight");
		else if(BMI>=18.5 && BMI<24.9)
			System.out.println("BMI:" + BMI + "," + "Category: Normal weight");
		
		else if(BMI>=25 && BMI<29.9)
			System.out.println("BMI:" + BMI + "," + "Category: Overweight");
		else
			System.out.println("BMI:" + BMI + "," + "Category: Obesity");
	}
}
