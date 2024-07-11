import java.util.Scanner; 
public class Factor{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter number "); 
	int userInput = input.nextInt();
	int factors = 0;
	int numberOfFactors = 0;

	for(factors = 2; factors <= userInput; factors++){	
	if(userInput % factors == 0){
	numberOfFactors++;

			}
			}
		
	if(numberOfFactors > 1){
	System.out.printf("%d is not a prime number ");
	}else
	System.out.printf("%d is a prime number ");
		

	}

}