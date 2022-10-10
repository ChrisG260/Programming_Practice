package java_basics;

public class StringsPractice {

	public static void main(String[] args) {
		
		String hello = "Hello";
		
		System.out.println("String: " + hello);
		
		// String Length
		int len = hello.length();
		System.out.println("Length: " + len);
		
		// String substring
		String sub = hello.substring(2, 4);
		System.out.println("Substring: " + sub);
		sub = hello.substring(2);
		System.out.println("Substring: " + sub);
		
		
		//Compare strings
		String one = "one";
		String two = "two";
		
		if(one == two) {
			//Do not compare strings like this
		}
		
		if(one.equals(two)) {
			// Proper way to Compare strings 
		}
		
		if(one.equalsIgnoreCase("One")) {
			System.out.println("Ignore case: String matches ignoreing case");
		}
		
		// Get a char at a specific index
		//get char at
		System.out.println("Char At 2: " + one.charAt(2));
		
		//Index of first string matched
		String str = "Here is a string";
		int index = str.indexOf("a");
		System.out.println("Index of \'a\': " + index + " in string \"" + str + "\"");
		
		//Index of first string matched
		str = "Here is a string";
		index = str.lastIndexOf("r");
		System.out.println("Last Index of \'r\': " + index + " in string \"" + str + "\"");
		
		
		

	}

}
