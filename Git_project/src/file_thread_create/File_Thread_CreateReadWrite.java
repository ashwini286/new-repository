package file_thread_create;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class File_Thread_CreateReadWrite  {

	public static void main(String[] args) throws Exception {
		File myfile = new File( "G:\\FileHandlingss.txt");
		
		Thread t1 = new Thread(new Runnable ()
				{
			public void run() {
				
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
			}   
				});
		
		
	     //copy the file
		File copyfile = new File("G:\\FileHandlingss-copy.txt");
		Thread t4 = new Thread(new Runnable ()
				{
			public void run() {
		try {
			Files.copy(Path.of("G:\\FileHandlingss.txt"), Path.of("G:\\\\FileHandlingsCopy.txt"));
			System.out.println("Done");
		}catch (Exception e){
			System.out.println("Error");
		} 
			}
				});
		
	
	//code to write in file
	
		Thread t2 = new Thread(new Runnable () {
				public void run() {
			 try {
					FileWriter filewriter = new FileWriter("G:\\\\FileHandlingss.txt");
					filewriter.write("hllo i am ashwini sharma from madanpur It is only try to make project \n ok bye");
					filewriter.close();
				}  catch (IOException ex) {
					ex.printStackTrace();
				} 
				}
		
		});
	
		//code to read file
		
				Thread t3 = new Thread(new Runnable  ()
				{
					public void run() {
				try {
					File myfile = new File("G:\\\\FileHandlingss.txt");
					Scanner sc = new Scanner(myfile); 
				while(sc.hasNextLine()) {
						String line = sc.nextLine();
						System.out.println(line);
					}
					sc.close();
				} catch (FileNotFoundException e)
				{
					}
					}
					});
				
				t1.start();
				t2.start();
				t3.start();
				t4.start();
				
	}
	}

