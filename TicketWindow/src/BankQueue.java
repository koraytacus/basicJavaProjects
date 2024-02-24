//In this working,I set a basic queue system using with encapsulation.
import java.util.Scanner;

public class BankQueue {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Welcome to the Banking System...");
		System.out.println("Please Enter Your Citizenship Number : ");
		String idNumber = entry.nextLine();
		
		Identification guest = new Identification();
		guest.setCitizenShipNumber(idNumber);
				
		entry.close();
		
		
		

	}

}
