package condition;

public class Ex01 {

	public static void main(String[] args) {
		int first = 8;
		int second  =18;
		int third = 15;
		//max, min , mid 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		if (first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		if (max < third) {
			max = third;
		}
		if (min > third) {
			min = third;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
