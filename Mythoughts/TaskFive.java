import java.util.Scanner;

public class TaskFive{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int score = 0;
		int sum = 0;
		int evenScore = 0;

		for(counter=1;counter<=10;counter++){
		System.out.print("Enter score ");
		score = input.nextInt();
		if(score % 2 ==0){
		evenScore = score;

		sum = sum + evenScore;
		}
		}
		System.out.print("The sum of the even scores is "+sum);	
	}

}