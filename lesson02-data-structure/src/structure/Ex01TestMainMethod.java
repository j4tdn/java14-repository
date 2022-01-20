package structure;

public class Ex01TestMainMethod {
	//method
	public static void main(String[] args) {
		// ...println(content)
		System.out.println("Welcome to Java - Spring course");
		
		//call static method
		Ex01TestMainMethod.anotherMain();
		anotherMain();
		anotherMethod();
		
		//call non-static method
		Ex01TestMainMethod ex01 = new  Ex01TestMainMethod();
		ex01.otherMethod();
	}
	
	public static void anotherMain() {
		System.out.println("Fake main method");
	}
	
	private static void anotherMethod() {
		System.out.println("Another Method");
	}
	
	//non-static
	private void otherMethod() {
		System.out.println("Other Method");
	}
}
