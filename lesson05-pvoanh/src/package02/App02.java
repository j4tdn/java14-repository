package package02;

public class App02 {
	public static void main(String[] args) {
		int []a= {3, 2, 1, 6, 5,7,8};
		System.out.print(getMissingNumber(a, a.length+1));
	}
	public static int getMissingNumber(int []arr,int n) {
		
		return (n*(n+1))/2-sumOfElements(arr) ;
	}
	public static int sumOfElements(int []e) {
		int rs=0;
		for(int i:e) {
			rs+=i;
		}
		return rs;
	}
	
	//sort -> a[i] !=a[i+1]
}
