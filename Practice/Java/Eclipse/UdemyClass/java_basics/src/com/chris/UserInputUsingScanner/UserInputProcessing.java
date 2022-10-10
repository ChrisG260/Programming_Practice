package com.chris.UserInputUsingScanner;

import java.util.Scanner;

public class UserInputProcessing {

	public static void main(String[] args) {
		
		// User input using Scanner and System.in
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.print("Enter some text: ");
			String enteredText = input.nextLine();
			System.out.println("Entered Text: " + enteredText);
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally  {
			if(input != null) {
				input.close();
			}
		}

	}

}
