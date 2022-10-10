package java_basics;

import com.chris.exceptions.CustomRuntimeException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		// To throw a custom exception
		try {		
			throw new CustomRuntimeException("custom error occured");
		} catch (CustomRuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
