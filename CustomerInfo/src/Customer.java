
public class Customer {
	
	private String name;
	private int creditLimit;
	private String emailAdress;
	
	public String getName() {
		return name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	private Customer(String name, int creditLimit, String emailAdress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAdress = emailAdress;
	}

	private Customer() {
		this( "koray",2000,"kingcoder@mail.com");
	}
	

	private Customer(String name,String emailAdress) {
		
		this.name = "Ali";
		this.emailAdress = "ali@mail.com";
		
	}
		
	public static void main(String[] args) {
		
		
		//Customer customer1 = new Customer("trial",242,"trial@mail.com");
		//Customer customer1 = new Customer();
		Customer customer1 = new Customer("Ali", "ali@mail.com");
		System.out.println(customer1.getEmailAdress());
		System.out.println(customer1.getCreditLimit());
		System.out.println(customer1.getName());

	}

	
	
	
	
	
	
	
	

}
