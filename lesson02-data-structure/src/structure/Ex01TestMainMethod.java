package structure;

public class Ex01TestMainMethod {
	//method
	public static void main(String[] args) {
		//...println(content): in ra nội dung và xuống hàng
		System.out.println("Welcome to JAVA - Spring course");
		//call method
		//Ex01.anotherMain
		Ex01TestMainMethod.anotherMain();
		Ex01TestMainMethod.anotherMethod();
	}
	//[access modifier] [static] return_type method_name(parameters)
	public static void anotherMain() {
		System.out.println("Fake main method");
		
	}
	private static void anotherMethod() {
		System.out.println("another Method");
		
	}
	//non-static
	private void otherMethod() {
		System.out.println("Other Method");
	}
}
