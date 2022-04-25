package package04;

public class ReadNumber {
	public static void main(String[] args) {
		convertToWords("6".toCharArray());
		convertToWords("5".toCharArray());
		convertToWords("25".toCharArray());
		convertToWords("101".toCharArray());
		convertToWords("321".toCharArray());
		convertToWords("820".toCharArray());
		convertToWords("219".toCharArray());
	}

	public static void convertToWords(char[] num) {
		int len = num.length;
		if (len == 0) {
			System.out.println("empty string");
			return;
		}
		if (len > 3) {
			System.out.println("Length more than 3 is not supported");
			return;
		}
		String[] singleDigits = new String[] { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };

		String[] twoDigits = new String[] { "", "mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm",
				"mười sáu", "mười bảy", "mười tám", "mười chín" };

		String[] tensMultiple = new String[] { "", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi",
				"bảy mươi", "tám mươi", "chín mươi" };

		String[] tensPower = new String[] { "trăm" };

		System.out.print(String.valueOf(num) + ": ");

		if (len == 1) {
			System.out.println(singleDigits[num[0] - '0']);
			return;
		}
		int x = 0;
		while (x < num.length) {
			if (len >= 3) {
				if (num[x] - '0' != 0) {
					System.out.print(singleDigits[num[x] - '0'] + " ");
					System.out.print(tensPower[len - 3] + " ");
				}
				--len;
			} else {
				if (num[x] - '0' == 1) {
					int sum = num[x] - '0' + num[x + 1] - '0';
					System.out.println(twoDigits[sum]);
					return;
				} else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) {
					System.out.println("hai mươi");
					return;
				} else {
					int i = (num[x] - '0');
					if (i > 0)
						System.out.print(tensMultiple[i] + " ");
					else
						System.out.print("");
					++x;
					if (num[x] - '0' != 0)
						System.out.println(singleDigits[num[x] - '0']);
				}
			}
			++x;
		}
	}
}
