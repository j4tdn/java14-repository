package package05;

public class DemoApp {
// initial data
	public static TextBook[] initialTextBooks() {

		return new TextBook[] {
				new TextBook("SGK001",15000,"Bo giao duc DN",true),
				new TextBook("SGK002",17000,"Bo giao duc DN",false),
				new TextBook("SGK003",19000,"Bo giao duc DN",true)
		};
		
	}
	public static ReferenceBooks[] initialReferenceBooks() {
		return new ReferenceBooks[] {
				new ReferenceBooks("SGK001",15000,"Bo giao duc DN",1000),
				new ReferenceBooks("SGK002",17000,"Bo giao duc DN",2000)
		};
	}
}
