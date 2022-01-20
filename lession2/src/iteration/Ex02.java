package iteration;

public class Ex02 {
	public static void main(String[] args) {
		int i=0;
		
		while(i < 10) {
			System.out.println("i: " + i);
			i++;
		}
		
		System.out.println("==============");
		
		int k=0;
		while(true) {
			if(k == 10) {
				break;
			}
			System.out.println("k: " + k);
			k++;
		}
	}
}
