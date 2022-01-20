package structure;

public class Ex04 {
    public static void main(String[] args) {
    	Integer offer = 15;
    	System.out.println("hash salary 01: " + System.identityHashCode(offer));
		Integer salary = 9;
		System.out.println("hash salary 01: " + System.identityHashCode(salary));
		salary = 13;
		System.out.println("hash salary 02: " + System.identityHashCode(salary));
		System.out.println("current salary: " + salary);
		
		anualReview(salary);
		System.out.println(salary);
	}
    
    private static void anualReview (Integer currentSalary) {
    	currentSalary = 18;
    }
}
