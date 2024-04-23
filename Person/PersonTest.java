

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("Koray");
        p2.setName("Koray");
        p1.setAge(20);
        p2.setAge(20);

        System.out.println(p1.areEqualTest(p2));
        //Test whether two Person objects are equal (have the same name and age).
        p2.setName("Ahmet");
        p2.setAge(18);

        System.out.println(p1.sameNameTest(p2));
        //Test whether two Person objects have the same name.

        System.out.println(p1.sameAgeTest(p2));
        //Test whether two Person objects are the same age.

        System.out.println(p1.olderTest(p2));
        //Test whether one Person object is older than another.

        System.out.println(p1.youngerTest(p2));
        // Test whether one Person object is younger than another.


    }





}
