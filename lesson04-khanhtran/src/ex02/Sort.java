package ex02;

public class Sort {
	public static void sort(int[] a) {
		int front=0, back=a.length-1;
		for(int i = 0; i<a.length; i++) {
			if(a[i]%7 == 0 && a[i]%5 != 0) {
				int temp = a[i];
				a[i] = a[front];
				a[front++] = temp;
			}
		}
		for(int i = a.length-1; i > 0; i--) {
			if(a[i]%5 == 0 && a[i]%7 != 0) {
				int temp = a[i];
				a[i] = a[back];
				a[back--] = temp;
			}
		}
	}
    public static void main(String[] args) {
		int[] a = {12,21,25,19,32,35,49,10,33,14,18};
		sort(a);
		for(int x:a) {
			System.out.print(x + " ");
		}
	}
}
