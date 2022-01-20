package structure;

public class Ex04 {

	public static void main(String[] args) {
		int salary = 9;
		salary = 13;

		System.out.println("salary 2021: "+salary);
		
		anualReview(100);
		System.out.println("salary 2022: "+salary);
	}
	
	private static void anualReview(int currentSalary) {
		currentSalary = 18;
	}

}
