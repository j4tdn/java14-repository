package view;

public class Ex03UsingLocalVariable {
	// global scope
	private static String running10Km = "running 10Km";
	
	public static void main(String[] args) {
		run(20);
	}
	
	private static Runnable run(int time) {
		// enclosing scope
		// 1.1 -> outer scope --> out of lambda epression, but inside of current function
		String running5Km = "running 5km";
		
		// (X)Lambda expression - anonymous class - implementation class 
		// scope: (X) has difference scope with current class
		// require 
		// 1.1 --> variable must be(implicitly) final
		// 1.2 --> changing arbitrary 
		
		return() -> {
			// running5Km = "50Km;
			Ex03UsingLocalVariable.running10Km = "100Km";
			
			// inner scope
			String student = "Nam";
			System.out.println(student + " is " + running5Km + " in " + time + " (m)" );
			System.out.println(student + " is " + running10Km + " in " + time*2 + " (m)" );

		};
	}
}
