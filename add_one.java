// Given an non negative number represented as array of digits.
// your task is to add 1 to the number and return the number as array

import java.util.*;
public class add_one {
    static void addOne(int[] arr,int n){
        int carry=1;
        int i=n;
        while(i-1>=0){
            if(arr[i-1]!=9){
                arr[i-1]+=carry;
                carry=0;
                break;
            }
            arr[i-1]=0;
            i--;
        }
        if(carry==1){
            int[] newnum=new int[n+1];
            newnum[0]=1;
            arr=newnum;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        return;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        addOne(arr,n);
        s.close();
    }
}
