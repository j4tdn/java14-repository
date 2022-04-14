package structure;

/**
 * Giải thích cơ chế lưu trữ của các KDL có sẵn trong JAVA
   Integer, String, Double, Float, Long
   Khái niệm constant pool
   
   Giống nhau
   + Giá trị lưu trữ ở HEAP
   + Biến lưu trữ ở STACK
   
   Khác nhau
   NonNew: 
   + Lưu trữ constant pool(CP)
   + Chỉ tạo ở nhớ mới khi chưa tồn tại trên CP
   + Chỉ hoạt động với KDL có sẵn trong JAVA
   
   New:
   + Lưu trữ ở normal memory in HEAP
   + Luôn luôn tạo ô nhớ mới
   + Áp dụng cho KDL mình tạo ra
   + >>> Khởi tạo ô nhớ(đối tượng) trên HEAP
 */
public class Ex06 {
	
	private static int N = 1000000;
	
	public static void main(String[] args) {
		// Cách 1: String Literal >> non-new
		String l1 = "literal";
		String l2 = "literal";
		System.out.println("l1 hash: "+ System.identityHashCode(l1));
		System.out.println("l2 hash: "+ System.identityHashCode(l2));
		
		// Cách 2: String Object  >> new
		String o1 = new String("object");
		String o2 = new String("object");
		System.out.println("o1 hash: "+ System.identityHashCode(o1));
		System.out.println("o2 hash: "+ System.identityHashCode(o2));
		
		// 100 students(id, name, gradeName)
		// gradeName: String --> JAVA14
		// NonNew-ConstantPool: 100, 1
		//    New-ConstantPool: 100, 100
		
		System.out.println("==============");
		System.out.println("l1: " + l1);
		System.out.println("o1: " + o1);
		
		System.out.println("==============");
		
		// Save memory, time
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			String text = new String("something");
			String another = new String("something");
		}
		long end = System.currentTimeMillis();
		System.out.println("duration " + (end - start));
	}
}