package structure;

import java.util.Arrays;

/**
 * Viết method tìm kiếm phần tử lẻ trong mảng 
 * @author ADMIN
 *
 */
public class Ex11 {
	public static void main(String[] args) {
		int[] numbers= {1,4,3,29,30};
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	//Tạo ra hàm, cần xác định
	// 1.KDL trả về : int[]
	// 2.Tham só truyền vào : int []
	// 3.Access modifier : private
	
	private static int[] findOddNumbers(int[] elements) {
		//result = [0,0,0,0,0]
		int [] result = new int[elements.length];
		int run=0;
		
		//process
		// 1 ,4,3,29,30
		for(int element:elements) {
			if(element % 2 !=0) {
				result[run]=element;
				run++;
			}
		}
		//C2
		return Arrays.copyOfRange(result, 0, run);
		
		
		//C1
		
		 
		/*
		 * int[] finalResult= new int[run]; for(int i=0;i<run;i++) {
		 * finalResult[i]=result[i]; }
		 * 
		 * // result = [1,3 29,0 ,0] return result;
		 */
	}
}
