import java.util.Scanner;
class Animal{
    public String SpeciesName(String name){
        return name;
    }
}
class Mammal extends Animal{
    public Boolean hasFur(Boolean hasFur){ 
        return hasFur;
    }
}
class Dog extends Mammal{
    public String Breed(String breed){
        return breed;
    }
}

public class Animal_info{
    public static void main(String args[]){
       Scanner sand=new Scanner(System.in);
       System.out.print("enter species name:");
       String name=sand.nextLine();
       System.out.print("whether dog has fur:(true/false)");
       Boolean Fur=sand.nextBoolean();
       sand.nextLine();
       System.out.print("enter breed name:");
       String breed=sand.nextLine();
       Dog obj=new Dog();
       System.out.println("Name: "+obj.SpeciesName(name));
       System.out.println("Has Fur: "+obj.hasFur(Fur));
       System.out.println("Breed: "+obj.Breed(breed));
    }
}