package view;

public class Ex02FunctionDescriptor {
	public static void main(String[] args) {
		run(()-> {System.out.println("Running");});
	}
	
	public static void run(Runnable r) {
		r.run();
	}
}	
