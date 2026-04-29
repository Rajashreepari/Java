// check whether the given number is pallindrom or not.

import java.util.*;
public class check_pallindrome{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(rev==num){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not an Pallindrome");
        }
        s.close();
    }
}
