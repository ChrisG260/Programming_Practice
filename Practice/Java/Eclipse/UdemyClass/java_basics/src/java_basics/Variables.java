package java_basics;

public class Variables {

	@SuppressWarnings("unused") // Suppress the compiler warning for unused variables
	public static void main(String[] args) {
		
		
		//Characters
		char myLetter = 'D';         // Character
		String myText = "Hello";     // String
		
		//Boolean
		boolean myBool = true;       // Boolean
		
		//Numbers
		byte myByte = 55;            // 1 byte  Stores whole numbers from -128 to 127
		short myShort = 32000;       // 2 bytes	Stores whole numbers from -32,768 to 32,767
		int myNum = 5;               // Integer (whole number) 4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long myLong = 2;             // 8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float myFloatNum = 5.99f;    // 4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double MyDouble = 5.9d;      // 8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
		
		//Example scientific number
		float f1 = 35e3f;
		double d1 = 12E4d;
		

	}

}
