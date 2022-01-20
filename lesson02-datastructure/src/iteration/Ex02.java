package iteration;

public class Ex02 {
public static void main(String[] args) {
	//Exp1
	int i=0;
	
	//Exp2
	while(i<10) {
		//statement
		System.out.println("i: " +i);
		//exp3
		i++;
	}
	System.out.println("=======================");
	//exp1
	int k=0;
	//exp2
	while(true) {
		if(k==10) {
			break;
		}
		//statement
		System.out.println("k: " +k);
		//exp3
		k++;
	}
}
}
