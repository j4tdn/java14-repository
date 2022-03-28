package Ex02;

import java.util.Arrays;

public class Number {
public static void main(String[] args) {
	int [] number = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
	int [] arrange = findNumber(number);
	System.out.println(Arrays.toString(arrange));
}
public static int [] findNumber(int [] numbers) {
	int count = 0;
	int temp;
	int k = numbers.length - 1;
	for(int i=0; i < numbers.length; i++) {
		int num = numbers[i];
		if(num % 7 ==0 && num % 5 != 0) {
			      temp =  numbers[count]; 
			      numbers[count] = numbers[i];
			      numbers[i] =  temp;
			      count ++;
		}
		if(num % 5 == 0 && num % 7 != 0 && i < k) {
			  temp =  numbers[k]; 
		      numbers[k] = numbers[i];
		      numbers[i] =  temp;
		      k --;
		}
	}
	return numbers;
}
}
