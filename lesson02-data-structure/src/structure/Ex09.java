package structure;
/**
 * Khi nào biến dùng KDL nguyên thủy, đối tượng
 * 
 * KDL Nguyên thủy:
 * + int, float, char, double: lưu dữ liệu(luôn luôn tồn tại)
 * 
 * KDL Đối tượng: 
 * + Integer, String, Double, Character ..: wrapper chứa single value
 * + Item, CustomInteger: wrapper chứa thông tin các thuộc tính bên trong
 * + Giá trị: NULL hoặc NON-NULL
 * + Class(biến(lưu trữ dữ liệu), hàm(chức năng))
 * 
 * >> Extends: Collections
 * Cơ sở dữ liệu: Lưu trữ dữ liệu (cột(kiểu dữ liệu)) >> có hoặc ko
 * >> Đổ ra ứng dụng(thuộc tính) >> Đối tượng
 *
 */
public class Ex09 {
	public static void main(String[] args) {
		char tmp = '3';
		System.out.println("is digit: " + Character.isDigit(tmp));
	}
}