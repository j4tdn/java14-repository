package structure;


/*
 Giống nhay
 + giá trị lưu trữ ở Heap
 + Biến lưu trử ở Stack
 
 Khác nhau
 Nonew:
 + lưu trữ constan pool
 + Chỉ tạo ô nhớ mới khi chưa tồn tại trên CP
 + Chỉ hoạt động với KDL có sẵn trong JAVA
 New
 + lưu trữ ở normal memory in Heap
 + luon tao o nho moi
  + ap dung cho KDL minh tao ra
  + >>> Khởi tạo ô nhớ(đối tượng) trên HEAP
 */
public class Ex06 {
	public static void main(String[] args) {
		// Cách 1 : String Literal >> non new
		String l1 = "literal";
		String l2= "literal";
		System.out.println("l1 hash"+System.identityHashCode(l1));
		System.out.println("l1 hash"+System.identityHashCode(l2));
		
		//Cách 2: String Object >> new
		String o1 = new String("object");
		String o2 = new String("object");
		
		System.out.println("=========");
		System.out.println("l1"+System.identityHashCode(o1));
		System.out.println("o1"+System.identityHashCode(o2));
	}
}
