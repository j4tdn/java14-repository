package package02;

public class Ex02 {

	public static void main(String[] args) {
		int A[] = { 3, 2, 1, 6, 5 };
		sortArray(A);
		getMissingNumber(A);

	}

	 public static void sortArray(int [] arr) {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	    }

	public static int getMissingNumber(int a[]) {
		int i = 0;
		for(; i < a.length ; i++)
		{
			if(a[i] != i + 1)
			{
				return i+1;
			}
		}
		return i;

	}

}
