import java.util.Scanner;

public class evenORodd {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please Enter how many number do you want to check ?");
		int index = scnr.nextInt();
		int[] array_numbers = new int[index];
			
		for(int i=0;i<index;i++) {
			
			System.out.print(i + ". index number : ");
			array_numbers[i] = scnr.nextInt();
			
		}

		for(int x : array_numbers) {
			
			is_even_OR_odd(x);
			
		}
		
		scnr.close();

	}
	
	public static void is_even_OR_odd(int sayi) {
		
		if (sayi%2==0) {
			
			System.out.println(sayi + " is an even number");
			
		}else {
			
			System.out.println(sayi + " is an odd number");	
		}	
	}
}















































