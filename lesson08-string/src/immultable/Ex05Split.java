package immultable;

public class Ex05Split {
	public static void main(String[] args) {
		//String s = "Xin chao cac ban";
		String s = "XCong, 0349445045, Nu, English";
		
		String[] elements = s.split(",\\s");
		
		for(String element:elements) {
			System.out.println(element);
		}
		
	}
}
