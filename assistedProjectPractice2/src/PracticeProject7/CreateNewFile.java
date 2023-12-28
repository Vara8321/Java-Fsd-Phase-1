package PracticeProject7;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	
    private static void createFileUsingFileClass() throws IOException
    {
    	File file=new File("C:\\Users\\chitt\\eclipse-workspace\\assistedProjectPractice2\\src\\demo3.txt");
		
        if (file.createNewFile()){
            System.out.println("File is created!");
        }else{
            System.out.println("File already exists.");
        }
    }

	
	public static void main(String[] args) {
		
		try {
			createFileUsingFileClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
