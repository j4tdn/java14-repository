package structure;

// int : always have value default 0
// Integer: has value or not(NULL)

public class Ex05 {
		public static void main(String[] args) {
			//Jave :Integer, double ,....
			//testing primitive or object
			//Inmutable class
			//Integer salary = new Integer(9)
			
			Integer offer=15;
			System.out.println("hashcode : " + System.identityHashCode(offer));

			//Heap:normal memory \\ constant pool(inmutable)
			Integer salary = 9;
			System.out.println("hashcode salary 01: " + System.identityHashCode(salary));
			salary =13;
			System.out.println("hashcode salary 02: " + System.identityHashCode(salary));
			System.out.println("salary 2021 : "+ salary);
			
			anualReview(salary);
			System.out.println("salary 2022 :"+ salary);
		}
		//int currentSalary = salary // gan thi o stack
		private static void anualReview(Integer currentSalary) {
			currentSalary = 18;
			System.out.println("current salary:"+ currentSalary);
		}
}
