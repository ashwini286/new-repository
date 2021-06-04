package demo_purpose_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.*;

public class CreateDemoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   /* File f = new File("abc.txt");
    System.out.println(f.exists());
    f.createNewFile();
    System.out.println(f.exists());
	} */
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
			
				    int numLines = 0;
				    int numWords = 0;
				    //we need to read inn the file
				    Scanner as = null;
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
							System.out.println("your files does not exists");
						}
						//count the line number in file
					/*	 File myfile = new File("G:\\\\\\\\FileHandlingss.txt");
						if(myfile.exists()) {
							try {
								FileReader f = new FileReader(myfile);
								LineNumberReader as = new LineNumberReader(f);
								int LineNumberReader = 0;
								try {
									int lineNumberCount = 0;
									
									while(as.readLine()!=null) {
										lineNumberCount++;
									}
									System.out.println("total number of line in a file" +lineNumberCount);
								}catch(IOException e) {
									e.printStackTrace();
								}
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} */
						//count,line characters and numberWord
						int numwords = 0;
						int numLines = 0;
						int numchars=0;
						Scanner myfile = null;
						try {
					Scanner		file = new Scanner (new File ("G:\\\\\\\\FileHandlingss.txt"));
					myfile = file;
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				while(myfile.hasNextLine()) { 
					//we need the current line
					String curLine =  myfile.nextLine();
					int Size = curLine.length();
					boolean foundDiv = true; //no words on this line
					boolean foundchar = false; //no char yet
					//we want to check the current line for words
					for(int i=0;i<Size;i++) {
						if(curLine.charAt(i) == ' ') {
							//we have a division
							foundDiv =  true;
							foundchar = false;
							
						}else {
							//we found char
							foundchar = true;
							numchars++;
						}
						if(foundchar && foundDiv) {
							numwords  ++;
							foundDiv=false;
						}
					}
					numLines++;
					
				}
				myfile.close();
				System.out.println("number of words = " +numWords);
				System.out.println("number of Lines = " +numLines);
				System.out.println("number of character = " +numchars);
				System.out.println("Ashwini Sharma");
							}
							});
						t1.start();
						t2.start();
						t3.start();
						t4.start();
}
}