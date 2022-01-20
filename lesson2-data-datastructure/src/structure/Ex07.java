package structure;
/**
 Giải thích từ khòa final ( trong c là const)
 >> Hằng số : const 
 
 >> Variable : Stack
 >> Primitive: Value stack
 >> Object : value heap
 
 >> Modifiable 
 
 >> final >> hoạt dộng ở stack -- không thể cập nhật giá trị của biến ở stack 
 - Không thể gán = 
*/
public class Ex07 {
	public static void main(String[] args) {
		int tmp=99;
		final int number=20;
		// number=40; error
		// number=tmp; error
		System.out.println("number"+ number);
		
		System.out.println("===============");
		final Integer digit=20;
		//digit=40;
		System.out.println("digit"+digit);
		
		final Item itemA= new Item(1,1,"Device X",50);
		//itemA=new Item(13,124,"Device Y",99);
		itemA.price=99;
		System.out.println("itemA:"+itemA);
	}
}
