
/**
 * Create a class that represents a grade distribution for a given course. Write
 * methods to perform the following tasks:

 * • Set the number of each of the letter grades A, B, C, D, and F.
 * • Read the number of each of the letter grades A, B, C, D, and F.
 * • Return the total number of grades.
 * • Return the percentage of each letter grade as a whole number between 0
 * and 100, inclusive.
 * • Draw a bar graph of the grade distribution.

 * The graph will have five bars, one per grade. Each bar can be a horizontal
 * row of asterisks, such that the number of asterisks in a row is proportionate
 * to the percentage of grades in each category. Let one asterisk represent
 * 2 percent, so 50 asterisks correspond to 100 percent. Mark the horizontal
 * axis at 10 percent increments from 0 to 100 percent, and label each line
 * with its letter grade.
 * For example, if the grades are 1 A, 4 Bs, 6 Cs, 2 Ds, and 1 F, the total
 * number of grades is 14, the percentage of As is 7, the percentage of Bs is
 * 29, the percentage of Cs is 43, the percentage of Ds is 14, and the percentage
 * of Fs is 7. The A row would contain 4 asterisks (7 percent of 50 rounded to
 *  the nearest integer), the B row 14, the C row 21, the D row 7, and the F
 * row 4. The graph would look like this:
 * A: ****
 * B: **************
 * C: *********************
 * D: *******
 * F: ****
 * Test the class by creating a GradeDistribution object and reading in the
 * grades. Then print the total number of grades and the percentage of each
 * grade. Finally, draw the bar graph.
 * */


public class GradeDistribution {

    private final String nameOfCourse;

    private int A;
    private int B;
    private int C;
    private int D;
    private int F;

    public GradeDistribution(String nameOfCourse){
        this.nameOfCourse = nameOfCourse;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.F = 0;
    }

    public void setGrades(int A,int B,int C,int D,int F){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.F = F;

    }

    public String getGrades(){

        return  "Number of Grades A : " + this.A+
                "\nNumber of Grades B : " + this.B+
                "\nNumber of Grades C : " + this.C+
                "\nNumber of Grades D : " + this.D+
                "\nNumber of Grades F : " + this.F;
    }

    public int totalNumberOfGrades(){
        return this.A+this.B+this.C+this.D+this.F;
    }

    public double percantageOfGrade(int numberOfGrade){
        return (50.0*numberOfGrade)/totalNumberOfGrades();
    }

    public String numberOfAsteriks(int numberOfGrade){
        return "*".repeat((int)Math.round(percantageOfGrade(numberOfGrade)));
    }


    public String gradeDistributionGraph(){
        return "A:" + numberOfAsteriks(this.A)+
                "\nB:" + numberOfAsteriks(this.B)+
                "\nC:" + numberOfAsteriks(this.C)+
                "\nD:" + numberOfAsteriks(this.D)+
                "\nF:" + numberOfAsteriks(this.F);
    }

}
