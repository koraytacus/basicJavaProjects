import java.util.Scanner;

public class FactorialApp {

	public static long Factorial(long n) {

		if(n == 0 || n == 1) {
			return 1;
		}
		
		else {
			
			return Factorial(n-1)*n;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("Which number do you want to calculate the factorial : ");

			long entry = input.nextLong();
			input.nextLine();
			
			if (entry < 0) {
				
				System.out.println("The factorial of negative numbers cannot be calculated !");
				continue;
			}
			
			else {
				
				
				System.out.println("Factorial of " + entry + " is " + Factorial(entry));
				break;
				
			}
			
		} input.close();
	}
	
}
