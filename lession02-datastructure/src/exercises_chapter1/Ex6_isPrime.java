package exercises_chapter1;

public class Ex6_isPrime {
	public static void main(String[] args) {
		System.out.println(prime200());
	}
	public static long prime200() {
		int check=0;
		for(int i=1;i<Integer.MAX_VALUE;i++) {
			if(isPrime(i)) {
				check++;
				if(check==200) {
					return i;
				}
			}
				
		}
		return 0;
	}
	public static boolean isPrime(long a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}
