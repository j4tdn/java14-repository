package structure;

public class Ex04 {
	public static void main(String[] args) {
		int salary = 9;
		salary = 13;
		System.out.println("salary 2021: " + salary); // 13
		
		anualReview(salary);
		System.out.println("salary 2022: " + salary); // 13
	}
	
	private static void anualReview(int currentSalary) {
		currentSalary = 18;
		System.out.println("current salary: " + currentSalary);
	}
}