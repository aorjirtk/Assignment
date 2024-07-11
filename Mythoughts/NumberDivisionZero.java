import java.util.Scanner;
public class NumberDivisionZero{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number ");
		int number1 = input.nextInt();
		System.out.print("Enter number ");
		double number2 = input.nextInt();
		double quotient = number1 / number2;
		if(number2 == 0){
		quotient = 0.0;
		}

		System.out.print(quotient);
	}

}