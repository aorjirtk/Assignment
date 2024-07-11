import java.util.Scanner;

public class NumberDivisibleByFiveAndThreeOperator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number ");
		int num = input.nextInt();

		if(num % 5 ==0 & num % 3==0){

		System.out.print(num +" number is divisible by 3 and 5");
		
		}else
		
		System.out.print(num +" NOT is divisible by 5 or 3");
		
	
	}

}