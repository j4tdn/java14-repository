package structure;

/**
 * KDL đối tượng
 * + Lưu trữ tập hợp các phần tử là hằng số 
 * + Số lượng phần tử cũng không đổi
 * + Các phần tử liên quan về ngữ nghĩa với nhau
 * + Hàm khởi tạo mặc định thì có access modifier là private
 */
public enum CirclePos {
	// 
	INSIDE("Trong đường tròn"), 
	ONSIDE("Trên đường tròn"), 
	OUTSIDE("Ngoài đường tròn");
    public String value;
	// constructor
	CirclePos(String value) {
		 this.value = value;
		 
	}
    @Override
    public String toString() {
    	return value;
    }
}
