import java.util.Scanner;

public class TaskOne{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int score = 0;
		int sum = 0;

		for(counter=1;counter<=10;counter++){
		System.out.print("Enter number ");
		score = input.nextInt();

		sum = sum + score;
		}

		System.out.print("The sum of the scores is "+sum);	
	}

}