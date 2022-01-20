package structure;


/**
 * KLD mảng- array
 * Lưu trữ tập hợp các phần tử
 * Có cùng KDL
 * SÔ lượng phần tử cố định
 * @author ADMIN
 *
 */
public class Ex10 {
	public static void main(String[] args) {
		// Khai báo và khởi tạo mảng số nguyên có 6 phần tử
		// Giá trị mặng định sẽ phụ thuộc và KDL của mảng
		
		int [] a = new int[6];
		a[2]=8;
		System.out.println("Gia tri phan tu a[2]"+a[2]); 
		
		// Khai báo và khởi tạo giá trị cho mảng
		// Length của mảng= số lượng phần tử mình khởi tạo
		// Length =5 
		int[] b = {5,6,4,6,4};
		System.out.println("lenght"+b.length);
		
		
		// Cho danh sách, mảng các phần tử số nguyên 
		// Tìm những số là bội của 3 và in ra 
		
		// Duyệt: forIndex(duyệt theo chỉ số), forEach(duyệt theo giá trị)
		
		// forEach
		for(int element:b) {
			if(element % 3 == 0) {
			System.out.println(element+"");
		}
			}
		System.out.println("\n=============");
		//forIndex
		for(int i=0;i<b.length;i++) {
			int element = b[i];
			if(element % 4 == 0) {
				System.out.println(element + " ");
			}
		}
	}
	
	
}
