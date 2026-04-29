// Given an array.your task is to find all leaders in array. 
// An element in an array is leader if it is greater than or equal to all elementsto its right.
// The  rightmost element is always leader.

import java.util.*;
public class check_leader_array {
    static void check_leader(int[] arr){
        int l=arr.length;
        // for(int i=0;i<l-1;i++){
        //     boolean flag=true;
        //     for(int j=i+1;j<l;j++){
        //         if(arr[i]<arr[j]){
        //             flag=false;
        //         }
        //     }
        //     if(flag==true){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
        // System.out.print(arr[l-1]);

        // ArrayList<Integer> leaders = new ArrayList<>();
        // int max=arr[l-1];
        // for(int i=l-1;i>=0;i--){
        //     if(arr[i]>=max){
        //         max=arr[i];
        //         leaders.add(max);
        //     }
        // }
        // Collections.reverse(leaders);
        // for(int num:leaders){
        //     System.out.print(num+" ");
        // }

        int[] newarr=new int[l];
        int max=arr[l-1];
        int j=0;
        for(int i=l-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                newarr[j]=max;
                j++;
            }
        }
        for(int i=j-1;i>=0;i--){
            System.out.print(newarr[i]+" ");
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
        check_leader(arr);
        s.close();
    }
}
