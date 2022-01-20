package structure;

/** Kiểu dữ liệu đối tương
 * Lưu trũ tập hợp các phần tử là hằng số
 * Số lượng phần tử là không đổi
 * Các phần tử liên quan về ngữ nghĩa với nhau
 * Hàm khởi tạo mặc định(constructor) thì có access modifier là private
 * @author ADMIN
 *
 */
public enum CirclePos {
	//CirclePos ISIDE = new CirlePOS("Trong đường trong");
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	public String value;
	
	CirclePos(String value) {
		this.value=value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
