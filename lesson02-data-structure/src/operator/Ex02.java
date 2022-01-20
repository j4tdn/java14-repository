package operator;

/**
 * 
 * 
 *toán tử ++ và -- trong trường hợp prefix, suffix
 *prefix: ++ -- trước được KQ rồi mới đem đi xử lý
 */
public class Ex02 {
	public static void main(String[] args) {

		int digit = 8;
		int sffValue = digit++; // digit = digit +1
		System.out.println("sffValue: " + sffValue);
		System.out.println(": " + digit);

		System.out.println("===========");

		int number = 8;
		int preValue = number++; // digit = digit +1
		System.out.println("preVlaue: " + preValue);
		System.out.println("number: " + number);

		System.out.println("===========");
	}

}
