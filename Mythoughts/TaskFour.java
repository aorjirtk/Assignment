import java.util.Scanner;

public class TaskFour{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int score = 0;
		int sum = 0;
		double average = 0;

		for(counter=1;counter<=10;counter++){
		System.out.print("Enter number ");
		score = input.nextInt();
		if(counter==1){
		continue;
		}
		if(counter==3){
		continue;
		}
		if(counter==5){
		continue;
		}
		if(counter==6){
		continue;
		}
		if(counter==7){
		continue;
		}
		if(counter==8){
		continue;
		}
		if(counter==9){
		continue;
		}

		sum = sum + score;
		
		}
		
		System.out.println("The sum of the scores is "+sum);
	
	}

}