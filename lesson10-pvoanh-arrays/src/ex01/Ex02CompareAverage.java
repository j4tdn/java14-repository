package ex01;

/**
 * So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
 * @author Oanhpv1008
 *
 */
public class Ex02CompareAverage {
	public static void main(String[] args) {
		int []numbers= {1,4,100,6,93,5,6};
		compareAverageOfHalfArray(numbers);
	}
	private static void compareAverageOfHalfArray(int []elements) {
		int firstHalfArray= elements.length/2;
		int sumFirstHalfArray=0;
		int sumLastHalfArray=0;
		for(int i=0;i<firstHalfArray;i++) {
			sumFirstHalfArray+=elements[i];
		}
		if(elements.length % 2 ==0) {
			for(int i=firstHalfArray;i<elements.length;i++) {
				sumLastHalfArray+=elements[i];
			}
		}
		else {
			for(int i=firstHalfArray+1;i<elements.length;i++) {
				sumLastHalfArray+=elements[i];
			}
		}
		System.out.println("sumFirstHalfArray: "+sumFirstHalfArray);
		System.out.println("sumLastHalfArray: "+sumLastHalfArray);
		System.out.println(sumFirstHalfArray > sumLastHalfArray ? "sumFirstHalfArray > sumLastHalfArray":"sumFirstHalfArray < sumLastHalfArray");
	}
}
