import java.util.Scanner;

public class SumOfScores{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int score = 0;
		int evenNumber = 0;
		int sum = 0;

		for(counter = 1; counter <= 10; counter++){
		System.out.print("Enter the score ");
		score = input.nextInt();

		if(score % 2 == 0){
		evenNumber = score;
		
		sum = sum + evenNumber;
		}
		}
		System.out.print("Sum of even numbers is "+sum);
	}

}