package iteration;

public class Ex01 {
public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		System.out.println("i: "+ i);
	}
	
	String [] element = {"aa", "bbb", "ccc".concat("d")};
	for (int i = 0; i < element.length; i++) {
		System.out.println(element [i]);
	}
	
	for(String element: elements) {
		System.out.println(element);
	}
}
}
