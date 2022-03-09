package interation;

public class Ex02 {
	public static void main(String[] args) {
		// Exp1
		int i = 0;
		//Ex02
		while (i < 10) {

			System.out.println("i = " + i);
			//Ex03
			i++;
		}
		System.out.println("====================");
		int k = 0;
		while (true) {
			if(k==10) {
				//thoát khỏi vòng lặp.
				break;
			}
			
			System.out.println("k = " + k);

			k++;
		}
		
		System.out.println("=========>>>>");
	}
}
