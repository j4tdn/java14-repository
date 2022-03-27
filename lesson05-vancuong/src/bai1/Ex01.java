package bai1;

import java.util.Scanner;

public class Ex01 {
	public boolean isPowerOfTwo(int n){
	    boolean ret;        
		if( 0 == n|| 1 == n ){
	    	     ret = false;       
	    }else{
	        int x = n / 2;
	        int y = n%2;
	        while ( x > 0){
	        	if (1 == y) {
	            ret = false;
	            break;
	 		};
			x = x / 2;
	        y = x%2;
		}
		ret = true;
		}
	   return ret;
	 } 
	
}