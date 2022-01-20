package structure;

/**
 * Giai thich KDL
 * 
 * Giong nhau : 
 * 	value -> HEAD
 * bien - > STACK
 * 
 * Khac nhau :
 * Nonnew :
 * + Lưu trữ ở constant pool
 * + Chỉ tạo ô nhớ mới khi ko có giá trị có sẵn
 * + CHỉ hoạt động với KDL có sẵn
 *  New
 *  lưu trữ ở nomal memory in HEAD;
 *  Luôn tạo ô nhớ mới
 *  Áp dụng cho KDL mình tạo ra 
 *  => Khởi tạo ô nhớ( đối tượng) trên HEAP;
 * 
 * 
 */

public class Ex06 {

	public static void main(String[] args) {
		// cach 1 : string literal >> non-new
		String l1 = " Literal";
		String l2 = " Literal";
		
		// cach 2 : String object >> new
		String o1 = new String("Object");
		String o2 = new String("Object");

	}

}
