import java.util.Scanner; 
public class NumberInWordWithIf{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	
	for(int counter = 1; counter <= 10; counter++){
	System.out.println("Enter number from 1-10 "); 
	int userInput = input.nextInt();
		if(userInput == 1){
		System.out.println("one");
		}else 
		if(userInput == 2){
		System.out.println("two");
		}else 
		if(userInput == 3){
		System.out.println("three");
		}else 
		if(userInput == 4){
		System.out.println("four");
		}else 
		if(userInput == 5){
		System.out.println("five");
		}else 
		if(userInput == 6){
		System.out.println("six");
		}else 
		if(userInput == 7){
		System.out.println("seven");
		}else 
		if(userInput == 8){
		System.out.println("eight");
		}else 
		if(userInput == 9){
		System.out.println("nine");
		}else 
		if(userInput == 10){
		System.out.println("ten");
		}else 
		System.out.println("Invalid input, enter number 1-10");
		
		}
	}
}