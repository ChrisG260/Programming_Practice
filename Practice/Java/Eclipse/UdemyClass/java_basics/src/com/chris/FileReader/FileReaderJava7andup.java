package com.chris.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderJava7andup {

	public static void main(String[] args) {
		
		File file = new File("myfile.txt");

		// try with resources, Java 1.7+, handles resource handling, eg: closing them
		try (FileReader fileReader = new FileReader(file);
			 BufferedReader bufferReader = new BufferedReader(fileReader);) {
			
			String line;
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 

	}

}
