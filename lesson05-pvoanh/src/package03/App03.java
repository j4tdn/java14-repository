package package03;

public class App03 {
	public static void main(String[] args) {
		int []A= {2,3,4};
		int bcnn=getLeastCommonMultiple(A);
		System.out.println("bcnn "+bcnn);
	}
	
	//bcnn=(a*b )/ ucln
	public static  int getLeastCommonMultiple(int [] arr) {
	        int temp = (arr[0]*arr[1])/UCLN(arr[0],arr[1]);
	        for(int i=2;i<arr.length;i++) {
	            temp = (temp*arr[i])/UCLN(temp,arr[i]);   
	        }
	        return temp;
	    }
	
	public static int UCLN(int a,int b) {
		for(int i = 2; i <= a && i <= b; i++)
	    {
	      if(a%i==0 && b%i==0)
	       return i;
	    }
		return 0;
	}
}
