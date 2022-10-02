package bt2;

public class Bai2 {
	public static void main(String[] args)
	{
		String str = "aavvjhahvbbbbbbbbbbbkja aa";
		System.out.println("Ký tự xuất hiện nhiều nhất là: "
						+ getMostFrequenlyApearing(str));
	}
	public static char getMostFrequenlyApearing(String str)
	{
		int count[] = new int[256];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		int max = -1; 
		char result = ' ';
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
}
