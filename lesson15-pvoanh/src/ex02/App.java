package ex02;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		/**
		 * Viết chương trình tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.
		 * Nếu tồn tại các ký tự có số lần xuất hiện bằng nhau. In ra các ký tự đó cách
		 * nhau bởi dấu phẩy. Yêu cầu chuỗi chỉ gồm các ký tự trong phạm vi [a-zA-Z] Ví
		 * dụ: input: aaaababbbddc  output: a input: aaaaccdcec  output: a, c
		 */

		String s = "aaaababbbbddc";
		byte[] sArr = s.getBytes();
		// Tạo mảng int đẻ lưu ký tự byte của chữ cái
		int[] arr = new int[256];
		for (int i = 0; i < sArr.length; i++) {
			// tăng giá trị tại index có giá trị bằng giá trị của sArr[i]
			arr[sArr[i]]++;
		}
		// lấy giá trị max của từng chữ
		int max = Arrays.stream(arr).max().getAsInt();
		for(int i =0 ;i< 256 ;i++) {
			// in ra chữ nào có giá trị trùng với max
			if(arr[i] == max) {
				System.out.println((char)i);
			}
		}
	}
}
