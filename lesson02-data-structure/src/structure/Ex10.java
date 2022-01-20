package structure;
/**
 * 
 * KDL Mảng - Array
 * +Lưu trữ tập hợp các phần tử
 * 	.Có cùng KDL
 * 	. SỐ lượng phần tử cố định
 */
public class Ex10 {
public static void main(String[] args) {
	// khai báo và khởi tạo mảng số nguyên có 6 phần tử
	// giá trị mặc định sẽ phụ thuốc vào KDL của mảng
	int[] a = new int [6];
	a[2] = 8;
	System.out.println("giá trị tại phần tử a[2]+ " + a[2]);
	
	//khai báo và khởi tạo giá trị cho mảng
	//Length của mảng =  số lượng phần tử mình khởi tạo
	//Length = 5
	int [] b= {5, 7, 9, 12, 4};
	System.out.println("Length: " + b.length);
	
	// cho danh sách, mảng các phần tử số nguyên 
	// tìm những số là bội của 3 và in ra
	// duyệt :forIndex(duyệt theo chỉ số), forrEach(duyệt theo giá trị)
	
	// forEach
	for (int element: b){
		if(element % 3 ==0	) {
			System.out.print(element);
		}
	}
	System.out.println("element");
	//forIndex
	for(int i = 0; i < b.length; i++) {
		int element = b[i];
		if (element %4 ==0) {
			System.out.println (element);
		}
	}
}
}
