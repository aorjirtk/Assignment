import java.util.Scanner;

public class TaskNine{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int score = 0;
		int sum = 0;
		int validScore = 0;
		for(int counter = 1; counter < 10; counter++){
		System.out.println("Enter score from 0-100 ");
		score = input.nextInt();
		if(score > 0 && score <100){
		validScore = score;
	
		sum = sum + validScore;
		}
		}

		System.out.println("The sum of the numbers is "+sum);
	}


}