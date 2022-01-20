package structure;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		// print ln : to print a content and end line
		System.out.println("Welcome to JAVA - Spring course");
		anotherMain();
		otherMethod();
		
	}
	// access modifier:public protected private
	// static
	// return type
	//method name(parameters)
	public static void anotherMain() {
		System.out.println("Fake main method");
	}
	private static void anotherMethod() {
		System.out.println("Another Method !");
	}
	@Deprecated
	private static void otherMethod() {
		System.out.println("Other method");
	}
}
