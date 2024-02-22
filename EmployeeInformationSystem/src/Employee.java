import java.util.Scanner;

public class Employee {

	private static Scanner entry = new Scanner(System.in);
	
	
	
	public String fullName;
	public String homeAdress;
	public String position;
	public String phoneNumber;
	public String employeeNumber;
	public String dateOfEmployment;
	public double salary;
	public int daysOffUsed;
	
	
		public Employee(String fullName, String homeAdress, String position, String phoneNumber, String employeeNumber,
		String dateOfEmployment, double salary, int daysOffUsed) {
		
		this.employeeNumber = employeeNumber;	
		this.fullName = fullName;
		this.homeAdress = homeAdress;
		this.position = position;
		this.phoneNumber = phoneNumber;
		this.dateOfEmployment = dateOfEmployment;
		this.salary = salary;
		this.daysOffUsed = daysOffUsed;
	}

	/*public void addEmployee() {

			
			
	String NewEmployeeNumber = entry.nextLine();
	employeeNumber = NewEmployeeNumber;	
			
	String newFullName = entry.nextLine();
	fullName = newFullName;
	
	String newFomeAdress = entry.nextLine();
	homeAdress = newFomeAdress;
	
	String newPosition = entry.nextLine();
	position = newPosition;
	
	String newPhoneNumber = entry.nextLine();
	phoneNumber = newPhoneNumber;
	
	
	String newDateOfEmployment = entry.nextLine();
	dateOfEmployment = newDateOfEmployment;
	
	double newSalary = entry.nextDouble();
	salary = newSalary;
	
	int newDaysOffUsed = entry.nextInt();
	daysOffUsed = newDaysOffUsed;
	
	
	Employee employee = new Employee(fullName,homeAdress,position,phoneNumber,employeeNumber,dateOfEmployment,salary,daysOffUsed);
		
		
		
		}*/
	
	public void findEmployee(String inputEmployeeNumber) {
			
		if (inputEmployeeNumber.equals(employeeNumber)) {
            System.out.println("Name: " + fullName);
            System.out.println("Home Address: " + homeAdress);
            System.out.println("Position: " + position);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Date Of Employment: " + dateOfEmployment);
            System.out.println("Salary: " + salary);
            System.out.println("Number of Days off: " + daysOffUsed);
        } else {
            System.out.println("Employee with number " + employeeNumber + " not found.");
        }
    }
		
		

		public void salaryChange() {
			System.out.println("1)Increasing - 2)Decreasing");
			int changeSelection = entry.nextInt();
			entry.nextLine();
			
			switch(changeSelection) {
			
			case 1 :	
			
			System.out.println("Please enter how much money that you want to increase :  ");
			int ıncreasingMoney = entry.nextInt();	
			this.salary += ıncreasingMoney ;
			System.out.println(" The salary of the employee named " +  fullName + " was increased by " + ıncreasingMoney + " $ ");
			System.out.println("New salary of " + fullName + " is " + this.salary + " $ ");
			break;
			
			case 2 :
			System.out.println("Please enter how much money that you want to decrease :  ");
			int decreasingMoney = entry.nextInt();
			this.salary += decreasingMoney;
			System.out.println(" The salary of the employee named " +  fullName + " was increased by " + decreasingMoney + " $ ");
			System.out.println("New salary of " + fullName + " is " + this.salary + " $ ");
			break;
			
			default:
				System.out.println("Wrong Entry");
				
			}
			
		}
		/*public void takeLeave(int numberOfDays) {
			
			this.daysOffUsed+=numberOfDays;
			System.out.println(fullName + " took " + daysOffUsed + " days off ");
		}*/
			
			
		public void informationModification() {
		System.out.println("1- Name " );	
		System.out.println("2- Home Adress ");	
		System.out.println("3- Position ");
		System.out.println("4-Phone Number ");
		System.out.println("5-Employee Number ");
		System.out.println("6-Date Of Employment");
		System.out.println("7-Salary ");
		System.out.println("8-Number of Days off ");
		
		
		
		
		int selectionEntry = entry.nextInt();
		entry.nextLine();
		
		switch (selectionEntry) {
		
		
		case 1:
			System.out.println("Please enter correct employee name : ");
			String changedName = entry.nextLine();
			this.fullName = changedName;
			break;
			
		case 2:
			System.out.println("Please enter correct employee's home adress : ");
			String changedHomeAdress = entry.nextLine();
			this.homeAdress = changedHomeAdress;
			break;
			
		case 3:
			System.out.println("Please enter correct employee's position :  ");
			String changedPosition = entry.nextLine();
			this.position = changedPosition;
			break;
			
			
		case 4:
			System.out.println("Please enter correct employee's phone number : ");
			String changedPhoneNumber = entry.nextLine();
			this.phoneNumber = changedPhoneNumber;
			break;
			
		case 5:
			System.out.println("Please enter correct employee's number : ");
			String changedEmployeeNumber = entry.nextLine();
			this.employeeNumber = changedEmployeeNumber;
			break;
			
		case 6:
			System.out.println("Please enter correct emsployee's date of employment : ");
			String changedDateOfEmployment = entry.nextLine();
			this.dateOfEmployment = changedDateOfEmployment;
			break;
			
		case 7:
			System.out.println("Please enter correct employee's salary : ");
			double changedSalary = entry.nextInt();
			entry.nextLine();
			this.salary = changedSalary;
			break;
			
			
		case 8:
			System.out.println("Please enter correct employee's days off :");
			int changedDaysOffUsed = entry.nextInt();
			entry.nextLine();
			this.daysOffUsed = changedDaysOffUsed;
			break;
			
		
			
		default:
			System.out.println("Your last selection is not available :");
			
			}		
		
		
		}
}
			