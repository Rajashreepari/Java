class Vehicle{
	public String make(String Make){
		return Make;
	}
	public String model(String Model){
		return Model;
	}
}

class Car extends Vehicle{
	public int numofdoors(int doors){
		return doors;
	}
}

class bike extends Vehicle{
	public String type(String Type){
		return Type;
	}
}

public class Car_bike{
	public static void main(String[] args){
		Car obj1=new Car();
		bike obj2=new bike();
		String Make1=obj1.make("Toyato");
		String Model1=obj1.model("corolla");
		int Numofdoors=obj1.numofdoors(4);
		String Make2=obj2.make("Yamaha");
		String Model2=obj2.model("R1");
		String Type=obj2.type("Sport");
		System.out.println("Car make : " + Make1);
		System.out.println("Car model : " + Model1);
		System.out.println("Number of doors : " + Numofdoors);
		System.out.println("Bike make : " + Make2);
		System.out.println("Bike model : " + Model2);
		System.out.println("Bike type : " + Type);
	}
}