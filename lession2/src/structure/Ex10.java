package structure;
/**
 * KDL Mang - Array
 * + Lưu trũ tập hợp các phần tử
 * 	. có cùng KDL
 * 	. Số lượng phần tử cố định
 *  */
public class Ex10 {
	public static void main(String[] args) {
		// Mảng số nguyên
		// Khai báo và khởi tạo mảng số nguyên có 6 phần tử
		// Giá trị mặc định sẽ phụ thuộc và KDL của mảng
		int[] a = new int[6];
		a[2] = 8;
		System.out.println("Giá trị tại phần tử a[2] : " + a[2]);
		System.out.println("====================================");
		// Khai báo và khởi tạo giá trị cho mảng
		// Length của mảng = số lượng phần tử mình khởi tạo
		int[]  b = {5,7,9,12,4};
		System.out.println("Length : " + b.length);
		System.out.println("==========================");
		// Cho danh sách mảng các phần tử số nguyên
		// Tìm những số là bội của 3 và in ra
		// Duyệt : forIndex(duyệt theo chỉ số), forEach(duyệt theo giá trị)
		// ForEach
		for(int element : b) {
			if(element % 3 == 0) {
				System.out.println(element + " ");
			}
		}
		
		System.out.println("==========================");
		// ForIndex bội của 4 và in ra
		for(int i=0; i < b.length;i++) {
//			int element = b[i];
//			if(element % 4 == 0) {
//				System.out.println(element + " ");
//			}
			if(b[i] % 4 == 0) {
				System.out.println(b[i]);
			}
		}
		int[] c = {5,7,9,12,4};
	}
}
