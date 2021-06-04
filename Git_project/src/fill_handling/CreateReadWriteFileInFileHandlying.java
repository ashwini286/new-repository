package fill_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateReadWriteFileInFileHandlying {

	public static void main(String[] args) {
		//code to create a new file ...
		File myfile = new File( "G:\\FileHandling.txt");
   try {
	if(myfile.createNewFile()) {
		System.out.println("File creating " +myfile.getName());
	}
	else {
		System.out.println("file already exitsts");
	}
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	System.out.println("an error accurred"); 
	e.printStackTrace();
} 
   //code to write to a file
   try {
	FileWriter filewriter = new FileWriter("G:\\\\FileHandling.txt");
	filewriter.write("hllo i am ashwini sharma \n ok bye");
	filewriter.close();
} catch (IOException e) {
	e.printStackTrace();
} 
			//code to read file
		File myfile = new File("G:\\\\FileHandling.txt");
		try {
			Scanner sc = new Scanner(myfile);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e)
		{
			
			
			e.printStackTrace();  
			 
		}
   
	}

}
