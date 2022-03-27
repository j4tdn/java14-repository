package package01;

public class Ex01 {

	public static boolean isPowerOf(int x, int y)
	{
		
		
		    	double k=Math.log10(x*1.0)/Math.log10(y*1.0);
			    if(k==(int)k) return true;
			    else {
			        double d=Math.log10(y*1.0)/Math.log10(x*1.0);
			        if(d==(int)d)
			         return true;
			        else return false;
			        
			    }
			   
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPowerOf(9, 3));
	}
	
}
