import java.util.Scanner;

public class primeNumberFinder {

	public static void main(String[] args) {
		
		
	Scanner scr = new Scanner(System.in);
	boolean isPrime = false;
	
	
	System.out.print("Please enter a number : ");
	int number = scr.nextInt();
	
	for(int a = 2;a<=(int)Math.pow(number,0.5);a++) {
		
		if (number%a == 0) {
			
			isPrime = false;
			break;
		}
		else {
			
		isPrime = true;	
		}
}
	
	if (isPrime) {
		
		System.out.println(number + " is a prime number");
	}
	else {
		
		System.out.println(number + " is not a prime number");
	}
			
	scr.close();
			} 
	}


