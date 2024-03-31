public class DogTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Dino",10,"German Shepherd");
        Dog dog2 = new Dog("Fıstık",3,"Golden Retriever");
        Dog dog3 = new Dog("Dino",10,"German Shepherd");

        //Test for different objects
        if(dog1.equal(dog2)){
            System.out.println(dog1.getNameOfDog() + " and " + dog2.getNameOfDog() + " are same dogs." );
        }
        else{
            System.out.println("They are different dogs !");
        }

        //Test for equal objects.
        if(dog1.equal(dog3)){
            System.out.println(dog1.getNameOfDog() + " and " + dog3.getNameOfDog() + " are same dogs." );
        }
        else{
            System.out.println("They are different dogs !");
        }


    }
}
