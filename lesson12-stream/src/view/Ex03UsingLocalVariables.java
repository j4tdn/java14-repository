package view;

public class Ex03UsingLocalVariables {
	// global scope:
	private  static String running10Km = "running 10 km";
	public static void main(String[] args) {
	
		run(20).run();;
		
	}
	public static Runnable run (int time) {
		//outer scope must be final,(implicitly)
		final String  running ="running 5km";
		
		//require: 
		return ()->{
			//inner scope
			String student = "Nam";
			System.out.println(student+ " is "+running +" in "+time +" s");
			System.out.println(student+ " is "+running10Km +" in "+time +" s");
		};
	}
}
