import java.util.Scanner;

public class TaskTwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int score = 0;
		int sum = 0;
		double average = 0;

		for(counter=1;counter<=10;counter++){
		System.out.print("Enter number ");
		score = input.nextInt();

		sum = sum + score;
		average = sum/counter;
		
		}
		
		System.out.printf("%s%.2f","The average of the scores is ",average);	
	}

}