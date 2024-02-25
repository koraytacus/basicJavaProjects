import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the Degree in Celcius : ");
		double celciusValue = input.nextDouble();
		
		double fahrenheitValue = celciusValue*(9/5)+32;
		
		System.out.println(celciusValue + " C is equal to " + fahrenheitValue + " F ." );
		
input.close();
	}

}
