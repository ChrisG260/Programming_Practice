package java_basics;

public class CastingBaseTypes {

	@SuppressWarnings("unused")  // Suppress the compiler warning for unused variables
	public static void main(String[] args) {
		/*
		  	Widening Casting (automatically) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double

			Narrowing Casting (manually) - converting a larger type to a smaller size type
			double -> float -> long -> int -> char -> short -> byte
		*/
		
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double
	    
	    double myDouble2 = 9.78d;
	    int myInt2 = (int) myDouble2; // Manual casting: double to int

	}

}
