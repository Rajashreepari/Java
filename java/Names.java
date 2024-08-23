import java.util.Scanner;
public class Names{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter size of the names:");
		int size=scanner.nextInt();
		scanner.nextLine();
		String[] names=new String[size];
		System.out.println("Enter a name of the " + size + " students:");
		for(int i=0;i<size;i++){
			System.out.print("Name " + (i+1) + " :");
			names[i]=scanner.nextLine();
		}
		String longestName=names[0];
		for(String name:names){
			if(name.length()>longestName.length()){
				longestName=name;
			}
		}
		System.out.println("Longest name :" + longestName);
		String shortestname=names[0];
		for(String name:names){
			if(name.length()<shortestname.length()){
				shortestname=name;
			}
		}
		System.out.println("Shortest name :" + shortestname);
		
		System.out.print("Names in reverse order: ");
		for(int i=names.length-1;i>=0;i--){
			System.out.print(names[i]);
			if(i!=0){
				System.out.print(",");
			}	
		}	
		
	}
}