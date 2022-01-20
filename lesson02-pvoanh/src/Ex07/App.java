package Ex07;

import java.util.Arrays;
import java.util.Random;

public class App {
	public static void main(String[] args) {
		Random rd= new Random();
		int []rs= new int [5];
		int i=1;
		rs[0]=rd.nextInt(11)+20;
		while(i<=4) {
			int temp=rd.nextInt(11)+20;
			if(isExist(rs, temp)) {
				System.out.println(temp);
				continue;
			}
			rs[i]=temp;
			i++;
		}
		System.out.println(Arrays.toString(rs));
	}
	public static boolean isExist(int []arr,int a) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				return true;
			}
		}
		return false;
	}
}
