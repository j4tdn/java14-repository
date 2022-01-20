package structure;

public class Ex05 {

	public static void main(String[] args) {
		//Immutable Class : Unable value IN HEAD

		Integer salary = 9;
		System.out.println("hash code salary 01 : " + System.identityHashCode(salary));
		
		salary = 13;
		System.out.println("hash code salary 02 : " + System.identityHashCode(salary));

		System.out.println("salary 2021 : " + salary);

		anualReview(salary);
		System.out.println("salary 2022 : " + salary);

	}

	private static void anualReview(Integer currentSalary) {
		currentSalary = 18;
		System.out.println("current salary : " + currentSalary);
	}

}
