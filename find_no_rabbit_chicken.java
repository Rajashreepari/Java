// there is a farm contains rabbits & chickens
// given leg count and head count.
// your task is to find no.of.rabbits and no.of.chickens can have in the farm.

import java.util.*;
public class find_no_rabbit_chicken {    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int leg=s.nextInt();
        int head=s.nextInt();
        s.close();
        if(leg%2!=0){
            System.out.println("Invalid Combination");
            return;
        }
        int chicken=(4*head-leg)/2;
        int rabbit=head-chicken;
        System.out.println("Rabbit: "+rabbit+" Chicken: "+chicken);
        return;
    }
}
