package package2;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] a = { 3, 2, 1, 6, 5 };
		System.out.println("Phần tử cần tìm có giá trị: " + getMissingNumber(a));
	}

	public static int getMissingNumber(int[] nums) {
		int n = nums.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum -= nums[i];
		return sum;
	}
}
