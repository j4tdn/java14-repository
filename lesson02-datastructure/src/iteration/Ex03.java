package iteration;

public class Ex03 {
public static void main(String[] args) {
	//Exp1
	int i=0;
	
	//Exp2
	 do{
		//statement
		System.out.println("i: " +i);
		//exp3
		i++;
	}while(i<10);
	System.out.println("=======================");
	//exp1
	int k=0;
	//exp2
	do {
		if(k==10) {
			break;
		}
		//statement
		System.out.println("k: " +k);
		//exp3
		k++;
	}while(true);
}
}
