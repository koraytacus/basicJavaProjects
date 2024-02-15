import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		

		Scanner scr = new Scanner(System.in);
		
		System.out.print(" Please Enter Your Full Name:");
		String fullName = scr.nextLine();
		
		System.out.print(" Please Enter Your Lecture Name:");
		String lecture = scr.nextLine();
		
		
		
		System.out.print(" Please Enter Your 1st Midterm Exam Grade:");
		float midtermGrade1 = scr.nextFloat();
		
		System.out.print(" Please Enter Your 2nd Midterm Exam Grade:");
		float midtermGrade2 = scr.nextFloat();
		
		System.out.print(" Please Enter Your Final Exam Grade:");
		float finalGrade = scr.nextFloat();
		
		float meanGrade = (0.3f)*midtermGrade1 + (0.3f)*midtermGrade2 + (0.4f)*finalGrade;
	
		if (meanGrade>60) {
			System.out.print(fullName+ "+ passed the" + lecture+" course with a GPA of "+meanGrade);

		}else {
			System.out.print(fullName + " failed the " + lecture +" course with a GPA of "+meanGrade);			
		}		
	
	scr.close();
	}	
}
