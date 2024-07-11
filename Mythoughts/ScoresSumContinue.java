import java.util.Scanner;

public class ScoresSumContinue{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int counter = 0;
	int sum = 0;
	int score = 0;
	int evenNumber = 0;
	
	for(counter = 1; counter <= 10; counter++){

	System.out.printf("Enter score ");
	score = input.nextInt();
	if(counter % 2 == 0){
	evenNumber = score;
	if(score == 3){
	continue;
		}
		}
	sum = sum + score;
			
	
		}
	System.out.print("sum of even numbers is "+sum);
	}

}
