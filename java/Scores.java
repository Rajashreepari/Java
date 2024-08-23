import java.util.Scanner;
public class Scores{
  public static void main(String[] args) {
    Scanner score=new Scanner(System.in);

    System.out.print("Enter the size of the array:");
    int size=score.nextInt();
    score.nextLine();
    int[] scores=new int[size];
    for(int i=0;i<size;i++){
    	System.out.print("Score " + (i+1)  + ": ");
        scores[i]=score.nextInt();
    }
    System.out.print("scores :");
    for(int i=0;i<size;i++){
    	System.out.print(scores[i] + " ");
    }
    System.out.println();
    int temp;
    for(int i=0;i<size;i++){
        for(int j=1;i<size;i++){
            if(scores[i]>scores[j]){
                temp=scores[i];
                scores[i]=scores[j];
                scores[j]=temp;
            }
        }
    }
    int highest_score=scores[size-1];
    int lowest_score=scores[0];
    System.out.println("Highest score: "+ highest_score);
    System.out.println("Lowest score: "+ lowest_score);
  }
}
