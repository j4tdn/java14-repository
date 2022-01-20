package structure;

/**
 * 
 * KDL đối tượng
 *	+ Lưu trữ tập hợp các phần tử là hằng số
 *	+ Số lượng phần tử không đổi
 *	+ Các phần tử liên quan về ngữ nghĩa với nhau
 *	+ Hàm khởi tạo mặc định thì có access modifier là private
 */

public enum CirclePos {
	// CirclePos INSIDE = new CirclePos("Trong đường tròn");
	// CirclePos INSIDE = new CirclePos("Trên đường tròn");
	// CirclePos INSIDE = new CirclePos("Ngoài đường tròn");
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");

	public String string;
	//contructor
	CirclePos(String string) {
		this.string = string;
	}
	
	@Override
	public String toString() {
		return this.string;
	}
	
	
	
}
