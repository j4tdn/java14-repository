package package03;



public class Ex03 {

	public static void main(String[] args) {
		
		int Array[] = {1, 2, 4,3};
		System.out.println(getLeastCommonMultiple(Array, 4));
	}
	public static int UCLN(int a, int b){
	    if(a==b) return a;
	    if(a>b) 
	       return  UCLN(a-b,b);
	    else
	        return UCLN(a,b-a);
		
	}
	
	public static int BCNN(int a, int b){
	    return (a*b/UCLN(a,b) );
	}
	
	public static int getLeastCommonMultiple(int Array[], int n)
	{
		int temp = BCNN(Array[0], Array[1] );
        for(int i=2;i<n;i++){
            temp = BCNN(temp, Array[i]);    
        }
        return temp;
		
	}
	
}
