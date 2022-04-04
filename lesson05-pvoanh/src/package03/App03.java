package package03;

public class App03 {
	public static void main(String[] args) {
		int []A= { 2, 3, 4, 5 };
		int bcnn=getLeastCommonMultiple(A);
		System.out.println("bcnn "+bcnn);
	}
	
	//bcnn=(a*b )/ ucln
	public static  int getLeastCommonMultiple(int [] arr) {
		if(arr.length ==0) {
			return Integer.MIN_VALUE;
		}
		if(arr.length==1)return arr[0];
	        int temp = (arr[0]*arr[1])/UCLN(arr[0],arr[1]);
	        for(int i=2;i<arr.length;i++) {
	            temp = (temp*arr[i])/UCLN(temp,arr[i]);   
	        }
	        return temp;
	    }
	
	public static int UCLN(int a,int b) { // greatestCommonMultiple
		int tmp;
	    while(b != 0) {
	        tmp = a % b;
	        a = b;
	        b = tmp;
	    }
	    return a;
	}
}
