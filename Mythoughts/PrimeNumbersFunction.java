 
public class PrimeNumbersFunction{
	public static boolean primeNumbers(int number){
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