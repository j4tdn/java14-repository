package Ex03;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int [] arr= {8,5,9,20};
		getLevelOfNumbers(arr);
		System.out.println(Arrays.toString(arr));
	}
	private static void getLevelOfNumbers(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				if(getSubmultiple(arr[i])>getSubmultiple(arr[j])) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	private static int getSubmultiple(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
}

