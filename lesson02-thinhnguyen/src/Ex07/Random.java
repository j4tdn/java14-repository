package Ex07;
import java.util.concurrent.ThreadLocalRandom;
public class Random {
	public static void main(String[] args) {
		Random();
	}
	public static void Random() {
		for(int i=0 ; i<5 ;i++) {
			Random rd = new Random();
			int ranNum = ThreadLocalRandom.current().nextInt(20,30);
			System.out.println("số random là : " + ranNum);
		}
	}
}
