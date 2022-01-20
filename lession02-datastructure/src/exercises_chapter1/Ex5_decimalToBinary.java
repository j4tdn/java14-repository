package exercises_chapter1;

import java.util.Arrays;

public class Ex5_decimalToBinary {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(decimalToBinary(121232)));
	}

	public static String[] decimalToBinary(long a) {
		String[]temp=new String[100];
		int i=0;
		while(a!=0) {
			temp[i++]=""+a%2;
			a/=2;
		}
		String []rs=new String [i];
		int d=0;
	   for(int t=i-1;t>=0;t--) {
		   rs[d++]=temp[t]; 
	   }
	   
	   return rs;
		
	}
}
