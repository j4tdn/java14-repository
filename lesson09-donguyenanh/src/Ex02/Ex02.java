package ex02;

/*
 * 
Bài 2(30đ): Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. Đoạn các
ký tự số liên tục tạo thành một số nguyên. Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn
nhất, sắp xếp các số lớn nhất nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
Ví dụ: với n = 1 : xâu 01a2b3456cde478 : Kết quả: 3456
với n = 2 : xâu aa6b546c6e22h, aa6b326c6e22h: Kết quả: 326, 546

Method signature: getLargestNumbers(String ...ss) >> String[]
 *
 */
public class Ex02 {
	public static void main(String[] args) {

		String n1 = "01a2b3456cde478";
		String n2 = "aa6b546c6e22h";
		String n3 = "aa6b326c6e22h";
		String[] numbers = getLargestNumbers(n1, n2, n3);
		printArray(numbers);

	}

	private static String[] getLargestNumbers(String... ss) {
		int[] numbers = new int[ss.length];
		int count = 0;
		for (String s : ss) {
			numbers[count++] = getTheBiggestNumberInString(s);
		}
		sort(numbers);
		String[] result = new String[numbers.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = " " + numbers[i];
		}
		return result;
	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private static int getTheBiggestNumberInString(String s) {
		int result = Integer.MIN_VALUE;
		int number = 0;
		if (s.isEmpty()) {
			return 0;
		} else {
			String[] numbers = s.split("[a-zA-z]+");
			for (String i : numbers) {
				if (i.isEmpty() || containSpecialCharacter(s)) {
					number = 0;
				} else {
					number = Integer.parseInt(i);
				}
				if (number > result) {
					result = number;
				}
			}
		}
		return result;
	}

	private static boolean containSpecialCharacter(String x) {
		for (int i = 0; i < x.length(); i++) {
			if (!Character.isDigit(x.charAt(i)) && !Character.isLetter(x.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static void printArray(String[] numbers) {
		System.out.print("Result: ");
		for (String i : numbers) {
			System.out.print(i + " ");
		}
	}
}