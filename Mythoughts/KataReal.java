import java.util.Scanner; 
public class KataReal{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println(); 
	int number = input.nextInt();
	if(number % 2 ==0)
		return true;
	else
		return false;



//question2
	public static boolean primeNumbers(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number "); 
	int userInput = input.nextInt();
	int numberOfFactors = 0;
	for(int factors = 2; factors <= number; factors++)	
	if(number % factors == 0)
	numberOfFactors++;
	if(numberOfFactors ==1)
		return true;
	else
		return false;


//question4
	//public static int divideInteger(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number1 "); 
	int userInput1 = input.nextInt();
	System.out.println("Enter number2 "); 
	int userInput2 = input.nextInt();
	int quotient = userInput1/userInput2;

	return quotient; 



//question3



System.out.println("Enter number1 "); 
	int userInput = input.nextInt();

	int factorsNumbers = FactorsOfNumber.factorsNumbers(userInput);
	System.out.print(factorsNumbers);

//question5
	System.out.println("Enter number1 "); 
	int userInput1 = input.nextInt();

	System.out.println("Enter number2 "); 
	int userInput2 = input.nextInt();

	int subtraction  = NumberSubtraction.subtraction(userInput1,userInput2);
	System.out.print(subtraction);

//question6
	System.out.println("Enter number "); 
	int number = input.nextInt();
		
	boolean squareRoot = NumberSquareRoot.squareRoot(number);
	System.out.println(squareRoot);


	}
	
}
