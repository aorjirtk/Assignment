import java.util.Scanner; 
public class KataFunctions{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String frontPage="""
	Press any number for the function:
	1.for even numbers to print True while odd numbers print False
	2.for prime numbers to print True while false for others
	3.for integers division
	4.for factors of number
	5.for subtraction
	6.square 
		""";
	System.out.println(frontPage);
	int function= input.nextInt();
	switch(function){
	
		case 1:
			System.out.println("Enter number "); 
			int number = input.nextInt();
			boolean evenOdd = EvenAndOddNumbers.evenOdd(number);
			System.out.println(evenOdd);
		break;

		case 2:	
			System.out.println("Enter number "); 
			int userInput = input.nextInt();
			boolean primeNumbers = PrimeNumbersFunction.primeNumbers(userInput);
			System.out.println(primeNumbers);
		break;

		case 3:	
			System.out.println("Enter number1 "); 
			int userInput1 = input.nextInt();

			System.out.println("Enter number2 "); 
			int userInput2 = input.nextInt();

			double divideInteger = NumberDivision.divideInteger(userInput1,userInput2);
			System.out.printf("%.2f",divideInteger);
		break;

		case 4:
			System.out.println("Enter number1 "); 
			int numberFactor = input.nextInt();

			int factorsNumbers = FactorsOfNumber.factorsNumbers(numberFactor);
			System.out.print(factorsNumbers);
		break;

		case 5:	
			System.out.println("Enter number1 "); 
			int input1 = input.nextInt();

			System.out.println("Enter number2 "); 
			int input2 = input.nextInt();

			int subtraction  = NumberSubtraction.subtraction(input1,input2);
			System.out.print(subtraction);
		break;

		case 6:	
			System.out.println("Enter number "); 
			int numberEntered = input.nextInt();
			boolean squareRoot = NumberSquareRoot.squareRoot(numberEntered);
			System.out.println(squareRoot);

		break;

		}

	}

}