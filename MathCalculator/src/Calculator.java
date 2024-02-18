import java.util.Scanner;

public class Calculator {

	// We create a method for displaying our calculation
	static void showing(int value1, String operation, int value2, int result) {

		System.out.println(value1 + " " + operation + " " + value2 + " = " + result);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // We create a Scanner Object
		System.out.println("The App is uploading...");
		System.out.println(
				" 1) + -> addition" + " 2) - -> subtraction" + " 3) * -> multiplication" + " 4) / -> division" + " 5) % -> modulus"
						+ " 6) = -> this sign gives main result of calculation ");
		System.out.println("You can start the calculation :");

		int result = 0;

		System.out.println("number :");
		int firstNumber = input.nextInt(); // We take a first number
		input.nextLine();// This is used to consume the newline character left in the input after reading
							// the value

		while (true) {
			System.out.println("operation :");
			String sign = input.nextLine();// We take a first operation sign

			if (sign.equals("=")) {
				System.out.println("Sonuç: " + firstNumber); // We determined finished condition for while loop
				break;
			}

			System.out.println("Number :");
			int otherNumber = input.nextInt();

			switch (sign) {

			case "+":
				result = firstNumber + otherNumber;
				showing(firstNumber, sign, otherNumber, result);
				firstNumber = result;
				break;

			case "-":
				result = firstNumber - otherNumber;
				showing(firstNumber, sign, otherNumber, result);
				firstNumber = result;
				break;

			case "*":
				result = firstNumber * otherNumber;
				showing(firstNumber, sign, otherNumber, result);
				firstNumber = result;
				break;

			case "/":
				if (otherNumber != 0) {
					result = firstNumber / otherNumber;
					showing(firstNumber, sign, otherNumber, result);
					firstNumber = result;
				} else {
					System.out.println("Zero Division Error,Program is rebooting...");
					System.out.println("Number : ");
					firstNumber = input.nextInt();
				}
				break;

			case "%":
				if (otherNumber != 0) {
					result = firstNumber % otherNumber;
					showing(firstNumber, sign, otherNumber, result);
					firstNumber = result;
				} else {
					System.out.println("Zero Division Error,Program is rebooting...");
					System.out.println("Number : ");
					firstNumber = input.nextInt();
				}
				break;

			default:
				System.out.println("Incorrect entry");
				break;
			}

			sign = input.nextLine(); // We are taking new operation sign
		}
		input.close();

	}

}
