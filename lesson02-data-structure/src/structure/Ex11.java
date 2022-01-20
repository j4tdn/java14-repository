package structure;

import java.util.Arrays;

/**
 * Viết phương thức - Tìm kiếm những phần tử lẻ trong mảng
 */
public class Ex11 {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 3, 29, 20 };
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	// Tạo ra hàm. Cần xác định
	// 1. KDL trả về         : int[]
	//  VOID: Không có return
	// #VOID: Có return
	// 2. Tham số truyền vào : int[]
	// 3. Access modifier    : private
	private static int[] findOddNumbers(int[] elements) {
		// result = [0, 0, 0, 0, 0]
		int[] result = new int[elements.length];
		int run = 0;
		
		// 1, 4, 3, 29, 20
		for (int element: elements) {
			if (element % 2 != 0) {
				result[run++] = element;
				// result[run] = element; run++;
			}
		}
		
		return Arrays.copyOfRange(result, 0, run);
		
		// result = [1, 3, 29, 0, 0]
		// int[] finalResult = new int[run];
		// for (int i = 0; i < run; i++) {
		//	finalResult[i] = result[i];
		// }
		
		// finalResult = [1, 3, 29]
		// return finalResult;
	}
}
