package structure;

import java.util.Arrays;

/**
 * 
 * Viết phương thức tìm kiếm những phần tử lẻ trong mảng
 *
 *
 */

public class Ex11 {

	public static void main(String[] args) {
		int[] number = { 1, 4, 3, 29, 20 };
		
		int[] oddNumbers = findOddNumbers(number);
		System.out.println(Arrays.toString(oddNumbers));
		
	}
	
	// Tạo ra hàm. Cần xác định
	// 1. KDL trả về
	// 2. Tham số truyền vào
	// 3. Access modifier
	
	private static int[] findOddNumbers(int[] elements) {
		int[] result = new int[elements.length];
		int run = 0 ;
		
		for(int element : elements) {
			if(element %2 != 0 ) {
				result[run] = element;
				run++;
			}
		}
		//cach 1 : 
//		int[] finalResult = new int[run];
//		for( int i=0; i<run ;i++) {
//			finalResult[i] = result[i];
//		}
//		return finalResult;
		
		//cach 2 :
		//su dung copyRange de copy 1 cai mang voi so luong phan tu tu 0-> run
		return Arrays.copyOfRange(result, 0, run);
	}

}
