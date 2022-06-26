package ex01;

import java.util.Arrays;

/**
 * Bài 1: Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
 * Loại b�? những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4} 
 * 
 * 
 * @author Oanhpv1008
 *
 */
public class Ex01DropElementExisted {	
	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,3,1};
		int [] rs= dropExistedElements(numbers);
		System.out.println(Arrays.toString(rs));
	}
	/*
	 * idea: + create a array to save numberOfExist this elements[i] in root array
	 * 		 + create a result arrays to get which element in values array=1 
	 */
	private static int []dropExistedElements(int []elements) {
		int [] values=new int[elements.length];
		int check=0;
		for( int i= 0;i< elements.length ;i++) {
			for(int e:elements) {
				if(elements[i] == e) {
					check++;
				}
			}
			System.out.println(check);
			values[i]=check;
			check=0;
		}
		int[] rs= new int[elements.length];
		int count=0;
		for(int i=0;i<values.length;i++ ) {
			if(values[i] == 1) {
				rs[count++]=elements[i];
			}
		}
		return Arrays.copyOfRange(rs, 0, count);
	}

}
