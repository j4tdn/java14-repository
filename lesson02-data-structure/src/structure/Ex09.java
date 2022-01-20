package structure;

/**
 * khi nào biến dung KDL nguyên thủy, đối tượng
 * 
 * KDL Nguyên thủy: 
 * +int. float, char, double: lưu dữ liệu (luôn luôn tồn tại)
 * 
 * KDL Đối tượng: Class(biến, hàm)
 * +Integer, String, Double..: wrapper chứa single value
 * +Item, CustomInteger: wrapper chứa thông tin các thuộc tính bên trong
 * +giá trị: Null hoặc NON-NULL
 * +Class (biến(lưu trữ dữ liệu), hàm(chức năng)) 
 * >> ExtendsL Collection
 * cơ sở dữ liệu: lưu triwx dữ liệu (cột(kiểu dữ liệu))
 */
public class Ex09 {
	public static void main(String[] args) {
		char tmp = '3';
		System.out.println("is digit: " + Character.isDigit(tmp));
		
	}
}
