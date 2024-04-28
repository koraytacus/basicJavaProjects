
public class Dog extends ZooManagement implements Animal {
	
	
public Dog(String breed, int age, String dateOfRegistrationString) {
		super(breed, age, dateOfRegistrationString);
		
	}



@Override
public void eat() {
	System.out.println("Dog is eating");
	
}

@Override
public void makeNoise() {
	System.out.println("RURF");
	
}

}
