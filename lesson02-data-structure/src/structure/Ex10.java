package structure;

/** 
 * KDL Mảng - Array
 * + Lưu trữ tập hợp các phần tử
 *   . Có cùng KDL
 *   . Số lượng phần tử cố định
 * */
public class Ex10 {
    public static void main(String[] args) {
		// Khai báo và khởi tạo mảng số nguyên có 6 phần tử
    	// Giá trị mặc định sẽ phụ thuộc vào KDL của mảng
    	int[] a = new int[6];
    	//System.out.println(a);
    	
    	// Khai báo và khởi tạo giá trị cho mảng
    	// Length của mảng = số lượng phần tử mình khởi tạo
    	// Length = 5;
    	int[] b = {5,7,9,12,4};
    	System.out.println("Length: " + b.length);
    	
    	// Cho danh sách, mảng các phàn tử
    	// Tìm những số là bội của 3
    	
    	// Duyệt: forIndex(duyệt theo chỉ số) forEach(duyệt theo giá trị)
    	
    	// forEach
    	for (int element: b) {
    		if (element % 3 == 0) {
    			System.out.println("element: " + " ");
    		}
    	}
    	
    	System.out.println("\n================");
		// forIndex
		for(int i = 0; i < b.length; i++) {
			int element = b[i];
			if (element % 4 == 0) {
				System.out.print(element + "  ");
			}
		}
    }
}
