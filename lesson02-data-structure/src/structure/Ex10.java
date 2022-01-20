package structure;

/**
 * KDL Array
 * + Luu tru tap hop cac phan tu�
 *   . Co cung KDL
 *   . So luong phan tu co dinh
 */
public class Ex10 {
	public static void main(String[] args) {
		// Khai bao mang 6 phan tu
		// Gia tri mac dinh phu thuoc vao KDL cua mang
		int[] a = new int[6];
		a[2] = 8;
		System.out.println("Gia tri phan tu� a[2]: " + a[2]);
		
		// Khai báo và khởi tạo giá trị cho mảng
		// Length của mảng = số lượng phần tử mình khởi tạo
		// Length = 5
		int[] b = {5, 7, 9, 12, 4};
		System.out.println("length: " + b.length);
		
		// Cho danh sách, mảng các phần tử số nguyên
		// Tìm những số là bội của 3 và in ra
		
		// Duyet: forIndex(duyet theo chi so), forEach(duyet theo gia tri)
		
		// forEach
		for (int element: b) {
			if (element % 3 == 0) {
				System.out.print(element + "  ");
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
