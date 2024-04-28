
public class Bird extends ZooManagement implements Animal{
	
public Bird(String breed, int age, String dateOfRegistrationString) {
		super(breed, age, dateOfRegistrationString);
		// TODO Auto-generated constructor stub
	}



@Override
public void eat() {
	System.out.println("Bird is eating");
	
}

@Override
public void makeNoise() {
	System.out.println("ciiik cik ciik");
	
}

}
