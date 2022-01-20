package iteration;

public class Ex03 {
	Ex03(){
		
	}
	int Ex03(int a) {
		return a;
	}
	 static public void main(String[] a) {
		Integer i=20;
		
		do {
			System.out.println("i: " + i);
			i++;
		} while(i < 1);
		
		System.out.println("==============");
		
		int k=0;
		
		do {
			if(k == 10) {
				break;
			}
			System.out.println("k: " + k);
			k++;
		} while(true);
	}
}
