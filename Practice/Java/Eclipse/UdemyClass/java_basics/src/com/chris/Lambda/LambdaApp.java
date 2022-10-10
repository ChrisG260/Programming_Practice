package com.chris.Lambda;

public class LambdaApp {

	public static void main(String[] args) {
		
		Human tom = new Human();
		Robot walle = new Robot();
		
		makeWalk(tom);
		makeWalk(walle);
		
		//Anonymous class
		makeWalk(
			new Walkable() {
	
				@Override
				public void walk() {
					System.out.println("New walker");
					
				}
				
		});
		
		//Lambda expression for above anonymous class above
		makeWalk(()-> System.out.println("Lambda walker"));
		
		//Lambda expression with multiple steps
		makeWalk(()-> {
			System.out.println("Lambda walker");
			//...more code
			System.out.println("..Other code..running");
			//...more code
		});
		
		//Lambda expression saved into a variable that is a functional interface
		// functional interface is an interface with only one abstract function
		//   Look at LambdaInterface example
		Walkable lamExp = ()-> { System.out.println("Lambda functional interface walker"); };
		makeWalk(lamExp);
		
		// Same as sayHello function
		LambdaInterface hello = () -> {System.out.println("Hello");};
		
		// Lambda with arguments
		LambdaInterfaceMath sum = (a, b) -> {return a+b;};
		//or
		LambdaInterfaceMath sum2 = (a, b) -> a+b;
		
		hello.emptyMethod();
		System.out.println("sum: " +  sum.calculate(1, 2));
		System.out.println("sum2: " +  sum2.calculate(4, 2));
		
		LambdaInterfaceMath div = (a, b) -> {
			if(b == 0) return 0;
			return a/b;
		};
		System.out.println("div: " +  div.calculate(4, 0));
		
		//Lambda to reverse string
		LambdaInterfaceStr reversStr = (a) -> {
			String result = "";
			for(int i = a.length() - 1; i >= 0; i-- ) {
				result += a.charAt(i);
			}
			return result;
		};
		System.out.println("Reverse string (My test string): " +  reversStr.execute("My test string"));
		
		
		//Lambda factorial
		LambdaInterfaceFac fac = (a) -> {
			int result = 1;
			for(int i = 1; i <= a; i++ ) {
				result *= i;
			}
			return result;
		};
		System.out.println("Factoral : " +  fac.execute(5));
		
		//Lambda factorial using generic functional interface
		LambdaInterfaceGeneric<Integer> gen = (a) -> {
			int result = 1;
			for(int i = 1; i <= a; i++ ) {
				result *= i;
			}
			return result;
		};
		System.out.println("Factoral : " +  gen.execute(6));
		

	}
	
	public static void makeWalk(Walkable walker)
	{
		walker.walk();
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
