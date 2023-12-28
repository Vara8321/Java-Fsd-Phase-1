import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingWrite {
	
	static String myFile2="C:\\Users\\chitt\\eclipse-workspace\\assistedProjectPractice2\\src\\demo2.txt";
	
	public static void main(String[] args) {
		
		fileWritingDemo();
		fileAppendingWritingDemo1();

	}

	//method to write into the file
	public static void fileWritingDemo() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(myFile2);

			fw.write("The weather is awesome today\n");
			fw.write("Hope it will be same tomorrow");

			System.out.println("Wrote 2 lines to the file. pls check it out");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//method to append something to existing file
	public static void fileAppendingWritingDemo1() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(myFile2, true);

			fw.write("\nI am now appending this line\n");
			fw.write("This line too");

			System.out.println("Appended 2 lines to the file. pls check it out");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
