package structure;

public class Ex04 {
	public static void main(String[] args) {
		int salary=9;
		
		salary=13;
		System.out.println("current salary: "+salary);
		annualReview(salary);
		System.out.println(salary);
	}
	
	private static void annualReview(int currentSalary) {
		currentSalary=18;
	}
}
