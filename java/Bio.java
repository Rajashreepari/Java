import java.util.Scanner;
class Bio{
     public static void main(String[]args){
     	Scanner scanner=new Scanner(System.in);
      	System.out.print("Enter your name:"); 
      	String name=scanner.nextLine();
      	System.out.print("Enter your age:");
      	int age=scanner.nextInt();
      	scanner.nextLine();
      	System.out.print("Enter your gender:");
      	String gender=scanner.nextLine();
      	System.out.print("Enter your weight:");
      	float weight=scanner.nextFloat();
      	System.out.print("Enter your height:");
      	float height=scanner.nextFloat();
	scanner.nextLine();
      	System.out.print("Enter your bloodgroup:");
      	String bloodgroup=scanner.nextLine();
        System.out.print("Enter your address:");
        String address=scanner.nextLine();
      	System.out.print("\tBio data"+ "\nName:"+ name + "\nAge:" + age + "\nGender:"+ gender + "\nWeight:" + weight + "\nHeight:" + height + "\nBloodgroup:" + bloodgroup + "\nAddress:" + address);
     }
}