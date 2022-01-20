package structure;
/*
 * Khi nào dùng KDL nguyên thuỷ , đối tượng
 * 
 * KDL Nguyên thuỷ:
 * + int, float, char, double: lưu trữ dữ liệu(luôn luôn tồn tại)
 * KDL �?ối tượng: Class(biến, hàm)
 * + Integer, String, Double, Character ... :wrapper chưa singer value
 * + Item, CustomInteger: wrapper chứa thông tin thuộc tính bên trong
 * + Giá trị : NULL hoặc NON-NULL
 * + Class(biến (lưu trữ dữ liệu), hàm(chức năng)))
 * 
 * >>Extend : Collections
 * cơ sở dữ liệu: lưu trũ dữ liệu(cột(kiểu dữ liệu ))>> có hoặc ko
 * >> đổ ra ứng dụng (thuộc tính )>> đối tượng
 * 
 */
public class Ex09 {
	public static void main(String[] args) {
		char tmp = '3';
		System.out.println("is digit " + Character.isDigit(tmp));
	}
}
