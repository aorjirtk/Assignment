import java.util.Scanner;

public class TaskEight{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int score = 0;
		int sum = 0;

		for(int counter = 1; counter < 10; counter++){
		System.out.println("Enter score from 0-100 ");
		score = input.nextInt();
		if(score < 0 || score >100){
		System.out.println(score+" is invalid");
	
		sum = sum + score;
		}
		}

		System.out.println("The sum of the numbers is "+sum);
	}


}