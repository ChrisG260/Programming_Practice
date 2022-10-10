package com.chris.UserInputUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputUsingScanner {

	public static void main(String[] args) {
		Scanner input = null;
	
		// Using scanner to read file
		try {
			File file = new File("InputFile.txt");
			input = new Scanner(file);
			String fileText; 
			System.out.println("File Content: ");
			while(input.hasNextLine())
			{
				fileText = input.nextLine();
				System.out.println(fileText);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		} finally  {
			if(input != null) {
				input.close();
			}
		}

	}

}
