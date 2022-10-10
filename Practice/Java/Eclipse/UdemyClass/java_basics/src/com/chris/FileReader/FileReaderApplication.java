package com.chris.FileReader;

import java.io.*;

public class FileReaderApplication {

	public static void main(String[] args) {

		// Back words compatible
		
		File file = new File("myfile.txt");
		BufferedReader bufferReader = null;
		FileReader fileReader = null;
		
		try {
			
			fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			String line;
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			
			try {
				
				if(bufferReader != null) bufferReader.close();
				if(fileReader != null) fileReader.close();
				
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			
		}

	}

}
