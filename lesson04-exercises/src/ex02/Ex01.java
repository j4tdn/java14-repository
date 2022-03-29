package ex02;

public class Ex01 {
	public static void handlingArray(int[] arr) {
		int standInFront = 0;
		int standBehind = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			if (arr[i] % 7 == 0 && arr[i] % 5 == 0) {
				continue;
			} else if (arr[i] % 7 == 0) {
				temp = arr[standInFront];
				arr[standInFront] = arr[i];
				arr[i] = temp;
				standInFront++;
			} else if (arr[i] % 5 == 0 && i < standBehind ) {
				temp = arr[standBehind];
				arr[standBehind] = arr[i];
				arr[i] = temp;
				standBehind--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		handlingArray(arr);
		System.out.print("Out put: ");
		for (int element : arr) {
			System.out.print(element + ", ");
		}
	}
}