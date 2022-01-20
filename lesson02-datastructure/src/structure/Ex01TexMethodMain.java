package structure;

public class Ex01TexMethodMain {
	public static void main(String[] args) {
		//in nội dung và xuống hàn
		System.out.println("welcome to JAVA 14-Spring");
		//call method
		//cách 1
		//Ex01.anotherMain();
		//cách 2
		anotherMain();
		
		anoterMethod();
		
		//error
		//Ex01.otherMethod()
		
		//call method non-static in class
		// >> khởi tạo đối tượng class
		// Class name_object = new Class;
		// Gọi phương thức 
		// name_object.method.
		
	}
	// [access modifier] [static] return_type method_name (parameters)
	public static void anotherMain() {
		System.out.println("fake main");
	}

	private static void anoterMethod() {
		System.out.println("Another Method");
	}
	
	private void otherMethod() {
		System.out.println("Other Method");
	}
	
	
	
	
	
	
	
	
	
}
