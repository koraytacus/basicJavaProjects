
public class ZooManagement implements Animal {
	String breed;
	int age;
	String dateOfRegistrationString;
	
	public ZooManagement(String breed, int age, String dateOfRegistrationString) {
		this.breed = breed;
		this.age = age;
		this.dateOfRegistrationString = dateOfRegistrationString;
		
		
	}

	public void displayAnimalInfo() {
		System.out.println("Breed: " + this.breed +
				"\nAge: " + this.age+
				"\nDate of Registration: " + this.dateOfRegistrationString);
	}

	@Override
	public void eat() {
		System.out.println("");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("");
		
	}


}
