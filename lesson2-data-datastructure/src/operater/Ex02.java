package operater;
/**
 * Toán tử ++ và -- trong trường hợp prefix và suffix ( trước và sau)
 * @author ADMIN
 *prefix ++ --- trước rồi được KQ đem đi xử lý
 *suffix Dùng KQ hiện tại đem đi tính toàn rồi mới ++ -- sau
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		int digit=8;
		int sffValue = digit++; //int sffValue=digit, digit= digit+1;
		System.out.println("sffValue"+ sffValue);
		System.out.println("digit"+ digit);

		
		System.out.println("==============");
		
		int number=8;
		int preValue = ++number; /// digit=digit+1,   int sffValue=digit
		System.out.println("preValue"+preValue);
		System.out.println("number"+number);
		
	}
}
