package structure;

import java.lang.constant.Constable;

/**
 *giai thich tu khoa final;
 *
 * >> Hang so : const  
 *
 * 
 * >> Modifiable const
 *	=> final hoạt động ở stack 
 *		- không thể cập nhật giá trị của biến ở STACK 
 *		- Không thể gán lại giá trị dùng toán tử "=" khi biến là final
 *		
 *
 *	=> CÓ THỂ CẬP NHẬT GIÁ TRỊ Ở HEAP
 *
 *
 *	
 */


public class Ex07 {
	
	public static void main(String[] args) {
		 int tmp = 99;
		 int number = 20;
		 
		 
		 
		 
		 final Item itemA = new Item(1, 1, "Iphone XS MAx", 50);
		// itemA = new Item(1, 2, "Iphone 12 MAx", 100);
		 //Reassign address in stack
		 itemA.price = 1000;
		 
		 //Best practice with final
		 final Item itemX = new Item(1, 1, "Iphone XX MAx", 50);
		 final Item itemy = new Item(2, 2, "Iphone XY MAx", 100);
		 itemX.price = itemy.price;
		 System.out.println(" itemX. price " + itemX.price);
		 
		
	}

}
