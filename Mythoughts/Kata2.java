import java.util.Scanner; 
public class Kata2{
	public static boolean evenOdd(int number){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number "); 
	number = input.nextInt();
	if(number % 2 ==0)
		return true;
	else
		return false;


	public static boolean primeNumbers(int number){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number "); 
	int numberOfFactors = 0;
	for(int factors = 2; factors <= number; factors++)	
	if(number % factors == 0)
	numberOfFactors++;
	if(numberOfFactors ==1)
		return true;
	else
		return false;


	}

}
			