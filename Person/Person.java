/*
        * Create a class named Person that includes the following:
        * • Set the name attribute of a Person object.
        * • Set the age attribute of a Person object.
        * • Test whether two Person objects are equal (have the same name
        * and age).
        * • Test whether two Person objects have the same name.
 * • Test whether two Person objects are the same age.
 * • Test whether one Person object is older than another.
 * • Test whether one Person object is younger than another.
 * Write a driver (test) program that demonstrates each method, with at least
 * one true and one false case for each of the methods tested.
 * */

public class Person {
    private String name;
    private int age;

    public Person(){
        this.name = getName();
        this.age = getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean areEqualTest(Person otherPerson){
        return this == otherPerson;
    }

    public boolean sameNameTest(Person otherPerson){
        return this.name.equals(otherPerson.name);
    }

    public boolean sameAgeTest(Person otherPerson){
        return this.age==otherPerson.age;
    }

    public boolean olderTest(Person otherPerson){
        return this.age>otherPerson.age;
    }
    public boolean youngerTest(Person otherPerson){
        return this.age<otherPerson.age;
    }
}
