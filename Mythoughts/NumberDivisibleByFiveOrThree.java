import java.util.Scanner;

public class NumberDivisibleByFiveOrThree{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number ");
		int num = input.nextInt();

		if(num%3 ==0 || num%5 ==0){

		System.out.print(num +" is divisible by 5 or 3");
		
		}else
		
		System.out.print(num +" NOT is divisible by 5 or 3");
		
	
	}

}