package ex07;

import java.util.Random;

public class App {
	public static void main(String[] args) {
		int n[] = new int [5];
		for(int i = 0; i<=4; i++) {
			Random r = new Random(); 
			int result = r.nextInt(30-20)+20;
			n[i] = result;
			System.out.println("Random Integer: " + result); 			
		}	
	}
}
