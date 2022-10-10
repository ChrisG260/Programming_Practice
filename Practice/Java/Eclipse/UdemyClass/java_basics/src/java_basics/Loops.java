package java_basics;

public class Loops {

	//@SuppressWarnings("unused") // Suppress the compiler warning for unused variables
	public static void main(String[] args) {
		
		
		int count = 0;
		
		System.out.println("Basic While loop ");
		while(count <= 5) {
			System.out.println("  Count = " + count);
			count++;
		}
		
		count = 0;
		System.out.println("Basic While loop with break ");
		while(true) {
			System.out.println("  Count = " + count);
			count++;
			if(count > 5) break;
		}
		
		System.out.println("Basic if loop ");
		for(int x = 0; x <= 5; x++) {
			System.out.println("  x = " + x);
		}
		
		System.out.println("Basic if loop with break (using mod 2, even number, stops)");
		for(int x = 0; x <= 5; x++) {
			System.out.println("  x = " + x);
			if(x > 0 && x%2 != 0) break;
		}
		
		System.out.println("Basic if loop : print each character of a string ");
		String str = "abcdefghijklmnopqrstuvwxyz";
		for(int x = 0; x < str.length(); x++) {
			System.out.println("  char = " + str.charAt(x));
		}
		
		System.out.println("Basic if loop : print each character of a string backwards ");
		for(int x = str.length() - 1 ; x >= 0; x--) {
			System.out.println("  char = " + str.charAt(x));
		}
		
		System.out.println("Basic if loop : print every other character of a string ");
		for(int x = 0; x < str.length(); x+=2) {
			System.out.println("  char = " + str.charAt(x));
		}

	}
}
