
public class BankAccount {
	
	private String accountNumber;
	private  int accountBalance;
	private String customerName;
	private String accountEmail;
	private String customerPhoneNumber;
	private String accountPassword;
	
	
	
	
	
	public BankAccount(String accountNumber, int accountBalance, String customerName, String accountEmail,String customerPhoneNumber,String accountPassword) {
		
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.accountEmail = accountEmail;
		this.customerPhoneNumber = customerPhoneNumber;
		this.accountPassword = accountPassword;
	}
	
	
	
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountEmail() {
		return accountEmail;
	}
	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
	
	public void depositing(int amountOfMoney) {
		this.accountBalance += amountOfMoney;
		System.out.println(amountOfMoney + " $ is deposited.");
		System.out.println("***************");
		System.out.println("Your current balance is " + this.accountBalance + "$");
	}
	
	public void withDrawing(int amountOfMoney) {
		if(this.accountBalance >= amountOfMoney) {
		this.accountBalance -= amountOfMoney;
		System.out.println(amountOfMoney + " $ is withdrawed.");
		System.out.println("***************");
		System.out.println("Your current balance is " + this.accountBalance + "$");
	}else {
		System.out.println("The amount requested to be withdrawn is more than the balance.\nThe operation cannot be performed");
	}
	}	
		
	public void showBalance() {
		System.out.println(this.accountBalance + "$");
	}
		
		
		
		
	}	
		
		
		
		
		

	
	
	
	
	
	
