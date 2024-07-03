
public class FactorsOfNumber{
	public static int factorsNumbers(int number){
	int numberOfFactors = 0;
	for(int factors = 1; factors <= number; factors++)
	if(number % factors == 0)
	numberOfFactors++;
	return numberOfFactors;

		
	}

}
