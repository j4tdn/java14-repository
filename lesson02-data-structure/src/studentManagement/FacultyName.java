package studentManagement;

public enum FacultyName {
	CNTT("công nghệ thông tin"),
	TDH("tự động hóa"),
	CTM("chế tạo máy"),
	KT("kiến trúc"), 
	CTT("công trình thủy");

	public String value;

	private FacultyName(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return value;
	}
}
