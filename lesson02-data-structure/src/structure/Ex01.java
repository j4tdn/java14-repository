package structure;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("well come to Java -spring course");
		
		Ex01.anotherMain();
		
		anotherMain();
		
	}
	public static void anotherMain() {
		System.out.println("Fakemain method");
	}
	
	private static void anotherMethor() {
		System.out.println("Another method");
	}
	
	
}
