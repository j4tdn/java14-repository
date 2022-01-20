package structure;

import java.util.Arrays;

/**
 * 
 * viết phương thức - Tìm kiếm những phần tử lẻ trong mảng
 */
public class Ex11 {
	public static void main(String[] args) {
		int [] numbers = {1, 4, 3, 29, 20};
		int [] oddNumbers = findOddNumbers (numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	private static int[] findOddNumbers(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}
	//Tạo ra hàm. Cần xác định
	// 1. KDL trả về			: int[]
	// VOID: ko có return
	// #VOID: có return
	// 2. Tham số truyền vào	: int[]
	// 3. Access modifier		: private
	private static int [] find0đNumbes (int [] elements) {
		int [] result = new int[elements.length];
		int run=0;
		//process 
		 for (int element: elements) {
			 if (element % 2 != 0) {
				 result[run++] = element;
				 run++;
			 }
		 }
		 
		return Arrays.copyOfRange(result, 0, run);
	}
	
}
//
//package structure;
///**
// *	viet phuong thuc - tim kiem phan tu le trong mang 
// **/
//public class Ex11 {
//	public static void main(String[] args) {
//		int[] numbers = {1,4,3,29,20};
//		findOddNumbers(numbers);
//	}
//	//tao ra ham . can xac dinh
//	//1. KDL tra ve
//	private static int[] findOddNumbers(int[] elements ) {
//		for(int i=0; i < elements.length;i++) {
//			if(elements[i] % 2 != 0) {
//				System.out.println(elements[i]);
//			}
//		}
//		return elements;
//	}
//}