package structure;

public class Ex01 {
    public static void main(String[] args) {
    	// in ra nội dung
		System.out.println("Welcome to JAVA - Sping course");
		// Ex01.anotherMain();
		anotherMain();
		anotherMethod();
	}
    
    // [access modifier] [static] return_type method_name(parameters)
    public static void anotherMain() {
    	System.out.println("Fake main method");
    }
    
    private static void anotherMethod() {
    	System.out.println("Another Method");
    }
    
    // non-static
    private void otherMethod() {
    	System.out.println("Other Method");
    }
}
