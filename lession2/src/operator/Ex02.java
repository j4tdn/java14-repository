package operator;
// prifix : ++ -- truoc duoc KQ roi moi dem di xu ly
// suffix
public class Ex02 {
	public static void main(String[] args) {
		int digit = 8;
		int newValue = digit++;//newValue = digit, digit = digit + 1
		System.out.println("newValue: " + newValue);
		System.out.println("digit: " + digit);
		
		System.out.println("====================");
		
		int number = 8;
		int newValue2 = number++;//newValue = digit, digit = digit + 1
		System.out.println("newValue: " + newValue2);
		System.out.println("digit: " + ++number);
		
//		
		int x=5,y=2,z=3;
		y += y + x++ + z++ + ++x - y-- + z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
