package operator;
/**
 * toán tử ++ và -- trong trường hợp là prefix, suffix
 * prefix: ++ -- trước
 * @author nguye
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		int digit=8;
		int sffValue= digit++; // int sffValue= digit, digit= digit +1
		System.out.println("sffValue: "+ sffValue);
		System.out.println("digit: "+digit);
		
		System.out.println("====================");
		int number=8;
		int preValue = ++number;
		System.out.println("preValue:" +preValue);
		System.out.println("number: "+ number);
	}


}


