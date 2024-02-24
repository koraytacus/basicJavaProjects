import java.util.Random;

public class Identification {
	
	private String citizenShipNumber;
	
	private String name;
	
	private String placeOfBirth;

	public String getCitizenShipNumber() {
		return citizenShipNumber;
	}

	public void setCitizenShipNumber(String citizenShipNumber) {
		//this.citizenNUumber = citizenNUumber;
		
		boolean check = true;
		if (citizenShipNumber.length() == 11) {
			
			for(int i = 0;citizenShipNumber.length()>i;i++) {
				
				char digit = citizenShipNumber.charAt(i);
				if (Character.isDigit(digit)) {
					
					continue;
				}else {
					
					check = false;
					break;
				}
		}
			if(check) {
				Random randomNumber = new Random();
				int queueNumber = randomNumber.nextInt(100);
				System.out.println("Your Queue Number is : " + queueNumber);
				System.out.println("Your are Welcome back .\nHave a Nice Day . " );
			}
			else {
				outputText("Please write all the digits as a number ! ");
			}
			
			
		}
		
		else {
			outputText("Incorrect Digit Entry. Please enter your 11 digits citizenship number ! ");
		}
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	
	
	public void outputText(String text) {
		
		System.out.println(text);
		
	}
	
	

}
