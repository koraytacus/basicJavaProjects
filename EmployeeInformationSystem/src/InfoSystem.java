import java.util.Scanner;


public class InfoSystem {

	public static void main(String[] args) {
		System.out.println("***********************Welcome to Employee Information System***********************");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("User Interface is uploading...");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(	"1) Find and Display Employee's information\n" + 
				 			"2) Change Employee' Information\n" +
							"3) Change Employee' Salary\n" + 
							"4) Quit ");

		Employee employee1 = new Employee("koray","Antalya/Muratpaşa","Senior Developer","5003124252","007","21.05.2000",500000,5);
		
	
		
		Scanner userEntry = new Scanner(System.in);

		System.out.println("Which selection do you want to use :");
		String userSelection = userEntry.nextLine();

		while (!userSelection.equals("5")) {
			switch (userSelection) {

			case "1":
				System.out.println("Please enter the employee's number :");
				String employeeID = userEntry.nextLine();
				 employee1.findEmployee(employeeID);
				break;

			case "2":
				employee1.informationModification();
				break;

			case "3":
				employee1.salaryChange();
				break;

			}
			System.out.println("Which selection do you want to use : ");
            userSelection = userEntry.nextLine();

			
		}
		System.out.println("Employee Information System is Closing ...");
		System.out.println("***********************Have A Nice Day***********************");


		userEntry.close();

	}



}
