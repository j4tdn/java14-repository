package ex04;

import java.util.Date;

public class App {
	public static void main(String[] args) {
		Date bd= new Date();
		
		Person dr= new Director("Pham Van Binh","28-03-2022",12.4d,2.4d);
		Person mng= new Manager("Pham Van An","28-03-2022",22.4d,2);
		Person st1= new Staff("Pham Van Chien","28-03-2022",52.4d,"IT");
		Person st2= new Staff("Pham Van Lê","28-03-2022",32.4d,"Tester");
		Person[] sts= {dr,mng,st1,st2};
		for(Person st:sts) {
			System.out.println(st);
		}
	}
}
