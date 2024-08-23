import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private static int TotalItemsSold = 0;
    private static double TotalRevenue = 0.0;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void sell() {
        TotalItemsSold++;
        TotalRevenue += this.price;
    }

    static int getsold(){
        return TotalItemsSold;
    }

    static double getrevenue(){
        return  TotalRevenue;
    }
}

public class onlinestore {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 35000.0);
        Item item2 = new Item("Mobile", 17000.0);
        Scanner count = new Scanner(System.in);
        System.out.print("enter no of laptops:");
        int Laptop_sold = count.nextInt();
        int l1 = 0;
        System.out.print("enter no of mobiles:");
        int mobile_sold = count.nextInt();
    
        for (int i = 1; i < Laptop_sold; i++) {
            item1.sell();
        }
        for (int i = 1; i <= mobile_sold; i++) {
            item2.sell();
        }
        System.out.println("Total Items sold:" + Item.getsold());
        System.out.println("Total Revenue:" +  Item.getrevenue());

    }
}