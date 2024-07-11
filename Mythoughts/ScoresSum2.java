import java.util.Scanner;

public class ScoresSum2{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int counter = 0;
	int sum = 0;
	int score = 0;
	int oddIndicesNumber = 0;
	

	for(counter = 1; counter <= 10; counter++){

	System.out.printf("Enter score ");
	score = input.nextInt();
	if(counter % 2 != 0){
	oddIndicesNumber = score;

	sum = sum + oddIndicesNumber;
			}
	
		}
	System.out.print("sum of even numbers is "+sum);
	}

}
	
