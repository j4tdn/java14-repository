package structure;

/**
 * 
 * KDL Mảng (Array)
 * + Lưu trữ tập hợp các phần tử
 * 	. có cùng KDL
 * 	. Số lượng phần tử cố định 
 * 
 * 
 * 
 *
 */


public class Ex10 {

	public static void main(String[] args) {
		//Mảng số nguyên
		//Khai báo và khởi tạp mảng số nguyên có 6 phần tử
		//Giá trị mặc định sẽ phụ thuộc và KDL của mảng
		 int[] a = new int[6];
		 a[2] = 8;
		 System.out.println(a[2]);
		 
		 //Khai báo và khởi tạo giá trị cho mảng
		 //Length của mảng = số lượng phần tử khởi tạo
		 //Length = 5
		 int[] b = new int[] {5,7,9,12,4};
		 System.out.println(b.length);
		 
		 // Cho danh sách , mảng các phần tử số nguyên
		 // Tìm những số là bội của 3 và in ra
		 
		 //Duyệt: ForIndex(duyệt theo chỉ số), forEach(duyệt theo giá trị)
		 
		 //ForEach
		 for(int element : b) {
			 if(element % 3 == 0) {
				 System.out.print(element + " ");
			 }
			 
		 }
		
		 System.out.println("\n====================");
		 //forIndex
		 for(int i = 0;i < b.length; i++) {
			 int element = b[i];
			 if(element % 3 == 0) {
				 System.out.print(element + " ");
			 }
		 }
		 
		
	}

}
