// one chocolate cost 1 rupee
// Ravi has n rupees he bought n chocolates
// the shop  offers discount on giving 1 chocolate per 3 wrappers.
// finally how many chococlates ravi has eaten.

import java.util.*;
public class total_chocolate_byGettingWith_Wrappers {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int rupees=s.nextInt();
        int total=rupees;
        while(rupees>=3){
            int wrapper_chocolate=rupees/3;
            total+=wrapper_chocolate;
            int remaining=rupees%3;
            rupees=wrapper_chocolate+remaining;
        }
        System.out.println("Total Chocolate: "+total);
        s.close();
    }
}
