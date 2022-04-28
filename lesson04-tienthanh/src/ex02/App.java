package ex02;


public class App {
	public static void main(String[] args) {
		int arr[]= {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		System.out.println("Danh sách ban đầu:");
		for(int element: arr) {
			System.out.print(element+" ");
		}
		int []arrSort= sortArray(arr);


		System.out.println("\nSau khi sắp xếp:");
		for(int element: arrSort) {
			System.out.print(element+" ");
		}
	}

	static int[] sortArray(int []arr) {
		int []arrSort=new int[arr.length];
		int head=0 , last=arr.length-1;
		String midElement = "";
		int indexStringArr=0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i]%7==0 && arr[i]%5!=0) {
				arrSort[head++] = arr[i];
				continue;
			}
			if(arr[i]%7!=0 && arr[i]%5==0) {
				arrSort[last--] = arr[i];
				continue;
			}
			midElement += (midElement=="") ? (arr[i]) : ("-"+arr[i]); 
		}
		if(midElement != "") {
			for(int i=head;i<=last;i++) {
				arrSort[i]=Integer.parseInt(midElement.split("-")[indexStringArr++]);
			}
		}
		return arrSort;
	}


}