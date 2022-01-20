package structure;

/**
 Giống nhau : + giá trị lưu trử ở HEAP
 			  + Biến lưu trữ ở Stack
 Khác nhau : + nowNew: + lưu trữ constant pool
 			 + new : + lưu trữ  ở normal memory in Heap
 			 		 + luôn luôn tạo ô nhớ mới
 			 		 + áp dụng cho KDL minhf tạo ra
 			 		 + >>>> khởi tạo ô nhớ trên HEAP
 */			 

public class Ex06 {
	private static int N=1000000;
	public static void main(String[] args) {
		// cách 1 : String literal >> non-new
		String l1="leteral";	
		String l2="leteral";
		System.out.println("hash l1: " + System.identityHashCode(l1));
		System.out.println("hash l2: " + System.identityHashCode(l2));
		// cách 2 : String object >> new
		String o1= new String("object");
		String o2= new String("object");
		System.out.println("hash o1: " + System.identityHashCode(o1));
		System.out.println("hash o2: " + System.identityHashCode(o2	));
		
		// 100 students (id, name, gradeName)
		// gradeName: String --> Java 14
		// Nonnew - Constanpool : 100,1
		// new - Constanpool :100,100
		System.out.println("=========");
		System.out.println("l1: " + l1);
		System.out.println("o1: " + o1);
		
		System.out.println("==========");
		long start = System.currentTimeMillis();
//		for(int i=0; i< N; i++) {
//			String text= "something";	
//			String another="something";
//		}
		for(int i=0; i< N; i++) {
			String text= new String("something");	
			String another=new String("something");
		}
		long end = System.currentTimeMillis();
		System.out.println("duration : " + (end - start));
	}
}