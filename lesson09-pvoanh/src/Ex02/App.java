package Ex02;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		String s1= "01a2b3456cde478";
		String s2="aa6b546c6e22h";
		String s3="aa6b326c6e22h";
		System.out.println(Arrays.toString(getLargestNumber(s1,s2,s3)));
	}
	
	private static int[] getLargestNumber(String... strings) {
		int[]rs=new int[strings.length];
		int count=0;
		for(int i=0;i<strings.length;i++) {
		
			int[] numbers=stringToInt(strings[i]);
			int max=getMax(numbers);
			rs[count++]=max;
		}
		sorted(rs);
		return Arrays.copyOfRange(rs, 0, count);
}
	private static void sorted(int []numbers) {
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
	}
	private static int[] stringToInt(String s) {
		String[]cuts=s.split("[a-z]+");
		
		int[] numbers= new int[cuts.length];
		for(int j=0;j<numbers.length;j++) {
			if(cuts[j].equals("")){
				continue;
			}
			numbers[j]=Integer.parseInt(cuts[j]);
		}
		return Arrays.copyOfRange(numbers, 0, numbers.length);
	}
	private static int getMax(int []numbers) {
		int max=numbers[0];
		for(int number:numbers) {
			if(number>max) {
				max=number;
			}
		}
		return max;
	}
}
