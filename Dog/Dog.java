public class Dog {

    private String nameOfDog;
    private int ageOfDog;
    private String breedOfDog;


    public Dog(String nameOfDog, int ageOfDog, String breedOfDog) {

        this.nameOfDog = nameOfDog;
        this.ageOfDog = ageOfDog;
        this.breedOfDog = breedOfDog;
    }


    public void setNameOfDog(String nameOfDog) {
        this.nameOfDog = nameOfDog;
    }

    public String getNameOfDog() {
        return nameOfDog;
    }

    public void setAgeOfDog(int ageOfDog) {
        this.ageOfDog = ageOfDog;
    }

    public int getAgeOfDog() {
        return ageOfDog;
    }


    public void setBreedOfDog(String breedOfDog) {
        this.breedOfDog = breedOfDog;
    }

    public String getBreedOfDog() {
        return breedOfDog;
    }


    public boolean equal(Dog other) {
        boolean nameCondition = this.nameOfDog.equals(other.nameOfDog);
        boolean ageCondition = this.ageOfDog == (other.ageOfDog);
        boolean breedCondition = this.breedOfDog.equals(other.breedOfDog);

        return (nameCondition) && (ageCondition) && (breedCondition);
    }//End of equal method.

}