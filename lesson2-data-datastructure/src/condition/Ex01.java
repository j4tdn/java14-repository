package condition;

/**
 * Cho 3 số nguyên a,b,c Viết chương trình tìm số lớn nhất nhỏ nhất và số còn
 * lại
 * 
 * @author ADMIN
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		int first = 8;
		int second = 10;
		int third = 15;
		Pair pair=getMinMax(first,second,third);

		System.out.println("max:" + pair.max);
		System.out.println("min:" + pair.min);
	}

	private static Pair getMinMax(int first, int second, int third) {
		// Max , min , mid
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
		return new Pair(min,max);

	}
}
