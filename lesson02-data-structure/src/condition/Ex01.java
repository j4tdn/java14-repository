package condition;

/**
 * Cho 3 so nguyen a,b,c Viet chuong trinh tim so lon nhat, so nho nhat va so
 * con lai, in ra
 * 
 * @author Cong Danh
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		int first = 90;
		int second = 18;
		int third = 15;

		// max
		//int max = first;
		//int min = second;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
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

		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}
