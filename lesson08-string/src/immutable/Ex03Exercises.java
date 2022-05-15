package immutable;

public class Ex03Exercises {
	public static void main(String[] args) {
		/*
		 * Tinh chieu dai chuỗi s ==> s.length
		 * nối chuôi s1 vao chuoi s2 ==> s = s.concat(s1) || s = s + s1;
		 * lấy 1 kí tự tại vi trị index(3) trong chuỗi s ==> s.chartAt(3);
		 * duyet tung phan tu trong chuoi: forindex, foreach(char c:s)
		 * tim vi tri - chi so xuat hien dau tien, cuối cùng của kí tự "a" trong chuỗi s
		 */
		
		String s = "apple"; // start : 0 end : 0
		System.out.println("start: " + s.indexOf('a'));
		System.out.println("end: " + s.lastIndexOf('a'));
		String s1 = "alibaba"; // start:0 end : 6
		System.out.println("start: " + s1.indexOf('a'));
		System.out.println("end: " + s1.lastIndexOf('a'));
		
		/*
		 * •Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
		 * startWidth,endWidth;
		 *	Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		 *	Loại bỏ các khoảng trắng thừa của chuỗi s3
		 *	Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
		 *	Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		*/
		String s2 ="hello alibaba";
		System.out.println("startWidth: " + s2.startsWith("hello"));
		System.out.println("endWidth: " + s2.endsWith("baba"));
		
		s2 = s2.replace("baba", "mama");
		System.out.println("s2: " + s2);
		
		String s3 ="  welcome to our class   ";
		System.out.println("trim: |" + s3.trim()+ "|");
		System.out.println("strip: |" + s3.strip()+ "|");
		System.out.println("strip Leading|" + s3.stripLeading()+ "|");
		System.out.println("trim Trailing|" + s3.stripTrailing()+ "|");
		
		s3 = s3.trim().replaceAll("\\s+"," ");
		System.out.println("s3: " + s3);
		System.out.println("sub 1-5: " + s3.substring(2));
		
		System.out.println("contains: " + s3.contains("class"));
	}
}
