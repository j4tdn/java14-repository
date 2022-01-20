package structure;
/**
 * KDL đối tượng
 * + Lưu trữ tập hợp các phần tử là hằng số
 * + Số lượng phần tử không đổi
 * + Các phần tử liên quan đến ngữ nghĩa với nhau
 * + Hàm khởi tạo mặc định thì có accesss modifier là private
 */
public enum CirclePos {
	// CirclePos INSIDE= new CirclePos("Trong đường tròn");
	// CirclePos ONSIDE= new CirclePos("Trên đường tròn");
	// CirclePos OUTSIDE= new CirclePos("Ngoài đường tròn");
	INSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn"),
	ONSIDE("Trên đường tròn");
	
	public String value;
	 CirclePos(String value) {
		this.value= value;
	}
	 @Override
	public String toString() {
		 return value;
	}
	 
}
