public class NumberSubtraction{
	public static int subtraction(int userInput1,int userInput2){
	int subtraction;
	subtraction = userInput1-userInput2;
	if(subtraction < 0)
	subtraction = userInput2-userInput1;

	return subtraction; 

	}

}

	
