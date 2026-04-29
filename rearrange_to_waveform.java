// Given an sorted array,rearrange the elements inplace to form a wave like array.
// an array is said to be wave form if it satisfies the following pattern
// arr[0]>=arr[1] and arr[1]<=arr[2] and arr[2]>=arr[3]

import java.util.*;
public class rearrange_to_waveform {
    static void rearrangge_waveForm(int[] arr,int n){
        int i=0;
        while(i<n-1){
            if(arr[i]!=arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            i+=2;
        }
        for(int j=0;j<n;j++){
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
        rearrangge_waveForm(arr, n);
        s.close();
    }
}
