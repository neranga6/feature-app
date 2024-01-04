package java11.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//Implementation of writeString() method in Java 
import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.nio.file.StandardOpenOption; 

public class FileWriteMethod { 
	
	public static void main(String[] args) 
	{ 
		// Initializing file Path with some conditions 
		Path filePath 
			= Paths.get("", "temp", "gfg.txt"); 

		try { 
			// Write content to file 
			Files.writeString(filePath, "Hello from GFG !!", 
							StandardOpenOption.APPEND); 

			// Verify file content 
			String content = Files.readString(filePath); 

			System.out.println(content); 
		} 
		catch (IOException e) { 
			e.printStackTrace(); 
		} 
	} 
}
