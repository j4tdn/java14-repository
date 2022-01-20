package structure;

/**
 * 
 * @author Oanhpv1008
 *
 */
public class Ex05 {
	public static void main(String[] args) {
		Integer salary=9;
		
		System.out.println("hash salary 01: "+System.identityHashCode(salary));
		
		// Heap: normal memory || constant pool
		salary=13;
		System.out.println("hash salary 02: "+System.identityHashCode(salary));
		System.out.println("current salary: "+salary);
		annualReview(salary);
		System.out.println(salary);
		
	}
	
	private static void annualReview(Integer currentSalary) {
		currentSalary=18;
	}
}
