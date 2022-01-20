package structure;

public class Ex01TestMainMethod {
	
	  public static void main(String[] args) { 
		  //..println(content): In ra noi dung va xuong hang 
		  System.out.println("Welcome to Java- Sprint course");
		  
		  //call method
		  //Ex01.anothermain();
		  anotherMain();
		  anotherMethod();
		  
		  //error
		  //Ex01TestMainMethod.otherMethod()
		  
		  //Class Ex01TestMainMethod
		  //How to call a non-static method in class Ex01TestMainMethod
		  //>> Initial an object from class Ex01TestMainMethod
		  Ex01TestMainMethod object = new Ex01TestMainMethod();
		  //?? Using created object to call non- static method
		  object.otherMethod();
		  
	  }
	 
	
	//[Access modifier] - [static] - return type  - method name(parameters) 
	public static void anotherMain() {
		System.out.println("Fake main method");
	}
	
	private static void anotherMethod() {
		System.out.println("Another method");
	}
	//non-static 
	private void otherMethod() {
		System.out.println("Other Method");
	}
}

