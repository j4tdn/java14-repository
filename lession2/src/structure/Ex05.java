package structure;

//int : alway have value : default 0
// Integer : has value or not (NULL)
public class Ex05 {
	public static void main(String[] args) {
		//immutable class : Unable to update value 
		Integer offer =15;
		System.out.println("hash offer: " + System.identityHashCode(offer));
		Integer salary = 9;
		System.out.println("hash salary 01: " + System.identityHashCode(salary));
		salary = 13;
		System.out.println("hash salary 02: " + System.identityHashCode(salary));
		System.out.println("salary 2021: " + salary);
		anualReview(salary);
		System.out.println("salary 2022: " + salary);
	}
	public static void anualReview(Integer currentSalary) {
		currentSalary = 18;
		System.out.println("Current Salary: " + currentSalary );
	}
}	
