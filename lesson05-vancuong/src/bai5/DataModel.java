package bai5;


public class DataModel {
private DataModel() {
		
	}
	
	public static TextBook[] initialTextBook (TextBook[] SGK) {
		return new TextBook[] {
				new TextBook("SGK123", 10000, "NHIDONG", new TextBook[] {} )
		}
		
	}
}
