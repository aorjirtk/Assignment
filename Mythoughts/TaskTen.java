import java.util.Scanner;

public class TaskTen{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int average = 0;
		int score = 0;
		int sum = 0;
		int validScore = 0;
		int validCounter = 0;

		for(int counter = 1; counter < 10; counter++){
		System.out.println("Enter score from 0-100 ");
		score = input.nextInt();
		if(score > 0 && score <100){
		validScore = score;
		sum = sum + validScore;
		}
		if(score > 0 && score <100){
		validCounter = counter;
		}
		}
		average = sum/validCounter;
		System.out.println("The sum of the numbers is "+sum);
		System.out.printf("The average of the numbers is %d", average);
	}


}