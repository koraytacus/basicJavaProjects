
public class Cat extends ZooManagement implements Animal{

	public Cat(String breed, int age, String dateOfRegistrationString) {
		super(breed, age, dateOfRegistrationString);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("MEOOOOWWWW");
		
	}

}
