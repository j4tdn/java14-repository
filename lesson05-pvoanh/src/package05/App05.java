package package05;

import java.util.Arrays;

public class App05 {
	public static void main(String[] args) {
		Book gk1= new TextBook("SGK1",46.4d,"Nhi Đồng","mới");
		Book gk2= new TextBook("SGK2",433.8d,"Nhi Đồng","mới");
		Book gk3= new TextBook("SGK3",98.3d,"Nam Phương","mới");
		
		Book tk1= new RefBook("STK1",242.3d,"Quốc Hà",2.2d);
		Book tk2= new RefBook("STK2",49.3d,"Nhi Đồng",3.1d);
		Book[] books= {gk1,gk2,gk3,tk1,tk2};
		
		Book[] pb= getPushlisherIsNhiDong(books);
		System.out.println(Arrays.toString(pb));
		
	
	}
	private static Book[] getPushlisherIsNhiDong(Book[]books) {
		Book[] rs= new Book[books.length];
		int c=0;
		for(Book book:books) {
		//	if(book.getPushlisher().equals("Nhi Đồng")) {
				rs[c++]=book;
		//	}
		}
		return Arrays.copyOfRange(rs,0,c);
	}
}
