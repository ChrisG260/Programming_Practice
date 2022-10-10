package com.chris.Threads.ThreadingInventroyManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Dictonary {
	
	List<String> dictonary;
	
	public Dictonary() {
		this.dictonary = new ArrayList<>();
	}
	
	public void loadDictonary(String fileName) {
		
		File file = new File(fileName);
		
		try (FileReader fileReader = new FileReader(file);
			 BufferedReader bufferReader = new BufferedReader(fileReader);) {
			
			String line;
			while((line = bufferReader.readLine()) != null) {
				dictonary.add(line);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
	
	public String getWord(int x) {
		return dictonary.get(x);
	}
	
	public String getRandomWord() {

		//Normal Random not thread safe
			//Random rand = new Random();
			//return dictonary.get(rand.nextInt(dictonary.size()));
		
		// Thread safe version
		int randomElementIndex  = ThreadLocalRandom.current().nextInt(dictonary.size()) % dictonary.size();
		
		return dictonary.get(randomElementIndex);
	}

}
