package ex01;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		arr = inputArray(arr);
		int position = positionOfLargestOddNumber(arr);
		if (position == -1)
			System.out.println("Không tồn tại số lẻ trong mảng");
		else
		    System.out.println("Số lẻ lớn nhất trong dãy vừa nhập là: " + arr[position]);
	}
    public static int[] inputArray(int[] arr) {
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0; i < arr.length; i++) {
    		System.out.print("Nhập số thứ " + (i + 1) + " : ");
    		arr[i] = sc.nextInt();
    	}
    	return arr;
    }
    /**
     * Phòng trường hợp ko có số lẻ ở trong mảng,
     * e chọn cách trả về vị trí số lẻ lớn nhất thay vì chính nó
     * trả về -1 == ko có số lẻ
     * */
    public static int positionOfLargestOddNumber(int[] arr) {
    	int largestOddNumber = Integer.MIN_VALUE;
    	int result = -1;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] % 2 == 1 && arr[i] > largestOddNumber) {
    			result = i;
    			largestOddNumber = arr[i];
    		}
    	}
    	return result;
    }
}
