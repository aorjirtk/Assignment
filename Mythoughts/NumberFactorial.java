import java.util.Scanner; 
public class NumberFactorial{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number "); 
	int number = input.nextInt();
	int factor=0;
	int count = 0;
	int multiple = 0;
	for(factor = 1; factor <= number; factor++){
	if(number % factor == 0){
	multiple++;
	System.out.println(multiple);
		}
		}

	//System.out.println(count);
	}
}

	
