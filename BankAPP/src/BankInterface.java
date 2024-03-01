import java.util.Scanner;

public class BankInterface {

	public static void main(String[] args) {
		
		
		Scanner entry = new Scanner(System.in);
		System.out.println("Welcome ...");
		
		
		BankAccount client = new BankAccount(null, 0, null, null, null, null);
		
		
		client.setAccountNumber("07000252");
		client.setAccountPassword("0707");
		client.setCustomerName("Koray");
		client.setAccountBalance(2000);
		client.setAccountEmail("xkralTr@hotmail.com");
		client.setCustomerPhoneNumber("5003208932");
		
		System.out.println("Please Enter Your Password:");
		String entryPassword = entry.nextLine();
		
		if(entryPassword.equals(client.getAccountPassword())) {
			System.out.println("1)Depositing\n2)Withdrawing\n3)Balance\n4)Quit(q)");
			String firstEntry = entry.nextLine();
		while (!firstEntry.equals("q")) {
						
			switch(firstEntry) {
			
			case "1":
				System.out.println("Amount of money to deposite : ");
				int moneyToDeposite = entry.nextInt();
				client.depositing(moneyToDeposite);
				break;
			case "2":
				System.out.println("Amount of money to withdraw : ");
				int moneyToWithdraw = entry.nextInt();
				client.withDrawing(moneyToWithdraw);
				break;
				
			case "3":
				client.showBalance();
				break;
			}
			entry.nextLine();
			System.out.println("---------------------------------------------------");
			System.out.println("1)Depositing\n2)Withdrawing\n3)Quit(q)");
			firstEntry = entry.nextLine();
			
		}
		
		System.out.println("Have a nice day ...");	

	entry.close();

	}

}
}