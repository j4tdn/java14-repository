package structure;


/**
Khi nào dùng KDL nguyên thủy, đối tượng
int floa char double lưu dữ liêu( luôn tòn tại)

Đối tượng: Có thể class( biến, hàm)
+ Integer, String , Double : chỉ chưa single value 
+ Item, CustomInteger : Wrapper chưa thông tin các thuộc tính bến trong 
+ giá trị null hoặc non null
+ Class:  biến( lưu dữ liệu), hàm( chức năng)

>> Extend: Collection 
Cơ sở dữ liệ: Lưu trũ dữ liệu(cột(kiểu dữ liệu)>> Có hoặc không)
Đổ ra ứng dụng( thuộc tính )>> Đối tượng

*/

public class Ex09 {
	public static void main(String[] args) {
		char  tmp = '3';
		System.out.println("is digit"+ Character.isDigit(tmp));
	}
}
