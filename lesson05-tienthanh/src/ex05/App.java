package ex05;

public class App {
	public static void main(String[] args) {
		TextBook t1 = new TextBook(01, 20000,"Kim Dong","old");
		TextBook t2= new TextBook(02, 15000, "Nhi Dong","new");
		TextBook t3 = new TextBook(03, 10000, "Thanh Nien","old");
		ReferenceBook r1 = new ReferenceBook(04, 13000, "Nhi Dong",0.4);
		ReferenceBook r2 = new ReferenceBook(05, 10000, "Nhi Dong", 1.0);
		Book[] books = {r1,r2};
	}
	
	

}