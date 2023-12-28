import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandlingRead {
	static String myFile="C:\\Users\\chitt\\eclipse-workspace\\assistedProjectPractice2\\src\\demo1.txt";
	
	public static void main(String[] args) {
		fileReadDemo1();
		fileReadDemo2();
	}
		
		// reads a single character at a time from file
		public static void fileReadDemo1() {
			FileReader fr = null;
			try {
				fr = new FileReader(myFile);

				int ch = fr.read();
				System.out.println(ch);//gives ASCII value of first Character
				

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fr.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		
	}
		
		//method to read all lines as strings from file
		public static void fileReadDemo2() {
			try {
				Path filePath = Path.of(myFile);
				List<String> lines = Files.readAllLines(filePath);

				for (String s : lines)
					System.out.println(s);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
}
