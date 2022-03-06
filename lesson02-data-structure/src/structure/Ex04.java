package structure;

// Operator '=' >> 100% used at STACK
public class Ex04 {
	public static void main(String[] args) {
		// constant boolean
		Integer offer = 13;
		System.out.println("hash offer: " + System.identityHashCode(offer));
		int salary = 9;
		System.out.println("hash salary 01: " + System.identityHashCode(salary));
		salary = 13;
		System.out.println("hash salary 02: " + System.identityHashCode(salary));
		System.out.println("current salary: " + salary);
	    
		anualReview(salary);
	}

	private static void anualReview(int currentSalary) {
		currentSalary = 18;
	}

}
