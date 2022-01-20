package structure;

// Operator '=' >> 100% used at STACK
// int: always have value: default 0
// Integer: has value or not(NULL)
public class Ex05 {
	public static void main(String[] args) {
		// JAVA: Integer, Long, Double, Float, String ...
		
		// testing primitive & object
		// Immutable class: Unable to update value IN HEAP
		// Integer salary = new Integer(9)
		
		Integer offer = 15;
		System.out.println("hash offer: " + System.identityHashCode(offer));
		
		// HEAP: NOMAL MEMORY || CONSTANT POOL(IMMUATABLE VALUES)
		Integer salary = 9;
		System.out.println("hash salary 01: " + System.identityHashCode(salary));
		
		salary = 13;
		System.out.println("hash salary 02: " + System.identityHashCode(salary));
		System.out.println("salary 2021: " + salary); // 13
		
		anualReview(salary);
		System.out.println("salary 2022: " + salary); // ??? >13< 18 
	}
	
	// Integer currentSalary = salary;
	private static void anualReview(Integer currentSalary) {
		currentSalary = 18;
		System.out.println("current salary: " + currentSalary);
	}
}
