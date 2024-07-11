import java.util.Scanner;

public class TaskSix{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int score = 0;
		int sum = 0;
		int evenScore = 0;
		int average = 0;
		int sumOfEvenCounter = 0;
		int evenCounter = 0;

		for(counter=1;counter<=10;counter++){
		System.out.print("Enter score ");
		score = input.nextInt();
		if(score % 2 ==0){
		evenScore = score;
		sum = sum + evenScore;
		if(score % 2==0){
		evenCounter = counter;
			}
		}
}
		average = sum/evenCounter;
		System.out.print("The average of the even scores is "+average);

	}

}