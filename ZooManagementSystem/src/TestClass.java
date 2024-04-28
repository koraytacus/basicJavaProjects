
public class TestClass {

	public static void main(String[] args) {


		ZooManagement cat = new Cat("Lion", 10, "05.26.2014");
		ZooManagement dog = new Dog("German Shepherd", 10, "03.12.2019");
		ZooManagement bird = new Bird("Parrot", 10, "11.16.2020");
		
		cat.displayAnimalInfo();
		cat.makeNoise();
		
		dog.displayAnimalInfo();
		dog.makeNoise();
		

		bird.displayAnimalInfo();
		bird.makeNoise();
		
	}

}
