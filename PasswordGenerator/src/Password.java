import java.util.Random;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
			
		char[] signs = {'!', '@', '#', '$', '&', '*', '_', '-', '<', '>', '.', '~'};
	
		System.out.println("Welcome to Password Generator...");
		System.out.println("---------------------------------------");
		
		
		System.out.println("How long password do you want to create:");
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int lenghtOfPassword = input.nextInt();
		input.nextLine();
		
		String password = "";
		
		for (int i = 0;lenghtOfPassword>=i;i++) {
			
			int randomNumber = random.nextInt(3);
			
			switch(randomNumber) {
			
			case 0://letter case
				randomNumber = random.nextInt(26);
				int randomOtherNumber = random.nextInt(26);
				//String valueOfDigitForLetters = Character.toString(letters[randomNumber]);
				String valueOfDigitForLetters;
				if (randomNumber>=randomOtherNumber) {
					valueOfDigitForLetters = Character.toString(letters[randomNumber]);
					if(valueOfDigitForLetters.equals("i")) {
						valueOfDigitForLetters = "I";
					}
					valueOfDigitForLetters = valueOfDigitForLetters.toUpperCase();
	
				}else {
					valueOfDigitForLetters = Character.toString(letters[randomNumber]);;
							
				}
				password+=valueOfDigitForLetters;
							
				break;
			case 1://number case
				randomNumber = random.nextInt(10);
				String valueOfDigitForNumber = Character.toString(numbers[randomNumber]);
				password+=valueOfDigitForNumber;
			case 2://sign case
				randomNumber = random.nextInt(12);
				String valueOfDigitForSign = Character.toString(signs[randomNumber]);
				password+=valueOfDigitForSign;
				break;
			}
		}
		System.out.println("Your password is being created... ");
		System.out.println("---------------------------------------");
		System.out.println("Your password is :\n" + password);
		input.close();
	}
}
