import java.util.Scanner;

public class RegistrationCheck {
	static Scanner receiver = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Page is uploading...");

		String[] user_data = sign_in();
		
		int amountOfTrial = 3;
		
		while(amountOfTrial>0) {
			
			if (login(user_data)) {
				System.out.println("Welcome to your Account");
				break;
			}
			else {
				System.out.println("Username or password is wrong");
				amountOfTrial-=1;
				if (amountOfTrial == 0) {
					System.out.println("There are a lot of incorrect entry, Please try after 10 minutes later ! ");
					
				}
				
			}
			
		}
		 receiver.close();
	} 
		
	public static String[] sign_in() {
		
		String[] user_info = new String[2];
		
		System.out.println("Please enter your username for registration :");
		String user_name = receiver.nextLine();
		System.out.println("Please enter your user password for registration : ");
		String user_password = receiver.nextLine();
				
		user_info[0] = user_name;
		user_info[1] = user_password;	
			
		return user_info;
		
	}
	
	public static boolean login(String[] array) {
	
	System.out.println("Enter your username:");	
	String input_user_name = receiver.nextLine();
	System.out.println("Enter your password:");
	String input_user_password = receiver.nextLine();
	
	if(array[0].equals(input_user_name) && array[1].equals(input_user_password)) {
		
		return true;
	}
	else {
		
		return false;
	}
	
  }

}	