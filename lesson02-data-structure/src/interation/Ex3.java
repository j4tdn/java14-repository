package interation;

public class Ex3 {
	public static void main(String[] args) {
		// Exp1
		int i = 0;
		//Ex02
		do {

			System.out.println("i = " + i);
			//Ex03
			i++;
		}while (i < 10);
		System.out.println("====================");
		int k = 0;
		do {
			if(k==10) {
				//Dừng, thoát khỏi vòng while;
				break;
			}
			
			System.out.println("k = " + k);

			k++;
		}while (true) ;
		
		System.out.println("=========>>>>");
	}
}
