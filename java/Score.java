import java.util.Scanner;
public class Score{
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
    int lowest_score=scores[0];
    int highest_score=scores[0];
    for(int Scores:scores){
    	if(lowest_score>Scores){
		lowest_score=Scores;
	}
	if(Scores>highest_score){
		highest_score=Scores;
	}
    }
    
    System.out.println("lowest Score : " + lowest_score);
    System.out.println("highest Score : " + highest_score);
    float avg,sum=0;
    for(int Scores:scores){
	sum+=Scores;
    }
    avg=sum/size;
    System.out.println("Average Score :" + avg);
  }
}
