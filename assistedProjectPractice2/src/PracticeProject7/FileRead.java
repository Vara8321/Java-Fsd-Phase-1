package PracticeProject7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileRead {
	
	static String myFile="C:\\Users\\chitt\\eclipse-workspace\\assistedProjectPractice2\\src\\demo3.txt";
	
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
	public static void main(String[] args) {
		fileReadDemo2();
	}
}
