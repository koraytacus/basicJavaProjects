import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class denemem1 {

	public static void main(String[] args) {
		
		
		try {
			File myObj = new File("koray.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created :" + myObj.getName());	
			}else {
				System.out.println("Your file is already created.");
			}	
		}catch(IOException e) {
			
			System.out.println("An error occured");
			e.printStackTrace();
			
		}
		
		try {
			FileWriter myWriter = new FileWriter("koray.txt");
			myWriter.write("Hi Koray, How are you ,I hope you are OK because you finally accomplish");
			myWriter.close();
			System.out.println("This stage is done.");
	
		}catch(IOException e ) {
			
			System.out.println("An Error Occured");	
			e.printStackTrace();
		}
		
		try {
			FileReader myReader = new FileReader("koray.txt");
			BufferedReader myBufferReader = new BufferedReader(myReader);
			String line;
			while((line = myBufferReader.readLine()) != null) {
				System.out.println(line);
			}
			
			myBufferReader.close();
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		}
	}


