package PracticeProject6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		FileReader f = null;
		String myFile = "C:\\temp\\demo1.txt";
		try {
			f = new FileReader(myFile);
			f.read();

		} catch (FileNotFoundException e) {
			System.out.printf("Given file %s not found in the system.  \n"
					+ " Make sure it is in the said location and then retry\n", myFile);

		} catch (IOException e) {
			System.out.printf("Given file %s is not read\n"
					+ " Make sure it has read permission for your account and then retry\\n", myFile);

		} 
		System.out.println(" Thank you ");

	}


}

