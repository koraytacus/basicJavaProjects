public class Species {
    private String breed;
    private int population;
    private double growthRate;
    private double area;

    public Species(String breed,int population,double growthRate,double area){
        this.breed = breed;
        this.population = population;
        this.growthRate = growthRate;
        this.area = area;
    }

    public double getBreed() {
        return area;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }



    public double densityOfPopulation(){

        return this.population/this.area;

    }


    @Override
    public String toString() {
        return "Breed: " + this.breed+
                "\nPopulation: " + this.population +
                "\nRate of Growth:" + this.growthRate+
                "\nArea:" + this.area + "square miles" +
                "\nDensity of Population:"+this.densityOfPopulation();

    }
}


