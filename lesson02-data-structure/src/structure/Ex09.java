package structure;

/**
 * khi nào dùng biến KDL nguyên thuỷ, đối tượng
 * 
 * Nguyên thuỷ: + int, float, char, double : lưu dữ liệu (luôn luôn tồn tại)
 * 
 * 
 * KDL Đối tượng: + Integer, Double, String, Character ... :string value + Item,
 * CustomInteger: wrapper chứa thông tin các thuộc tính bên trong + Giá trị :
 * NULL hoặc NON-NULL 
 * + Class(biến(lưu trữ dữ liệu),hàm(chức năng))
 * 
 * >>Extends: Collections
 * Cơ sở dữ liệu: Lưu trữ dữ liệu (cột(kiểu dữ liệu))>> có hoặc không
 * >> Đổ ra ứng dụng ( thuộc tính)>> đối tượng
 * 
 * 
 */
public class Ex09 {
	public static void main(String[] args) {
		char tmp = '3';
		System.out.println("is digit: "+ Character.isDigit(tmp));
	}
}
