package structure;

import java.util.Arrays;

/**
 *	viet phuong thuc - tim kiem phan tu le trong mang 
 **/
public class Ex11 {
	public static void main(String[] args) {
		int[] numbers = {1,4,3,29,20};
		int[] oddNumbers = findOddNumbers(numbers);
		//findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	
	//tao ra ham . can xac dinh
	//1. KDL tra ve
	// void : khong co return
	//2. tham so truyen vao : int[]
	//3. access modifier: privite
	private static int[] findOddNumbers(int[] elements ) {
//		for(int i=0; i < elements.length;i++) {
//			if(elements[i] % 2 != 0) {
//				System.out.println(elements[i]);
//			}
//		}
//		return elements;
		int[] result = new int[elements.length];
		int run = 0;
		for(int element : elements) {
			if(element % 2 !=0) {
				result[run] = element;
				run++;
			}
		}
		return Arrays.copyOfRange(result, 0 , run);
	}
}
