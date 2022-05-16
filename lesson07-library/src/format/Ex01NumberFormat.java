package format;

import java.text.DecimalFormat;

public class Ex01NumberFormat {
	//private static String pattern="#,###.###";
	private static String pattern="#,###.00";
	public static void main(String[] args) {
		double total=getFTotal()+0.23123;
		System.out.println("total: "+total);
		
		DecimalFormat df= new DecimalFormat(pattern);
		System.out.println(df.format(total));
	}
	private static double getFTotal() {
		double [] numbers= {4,8,12,17};
		double total=0;
		for(double number:numbers) {
			total+=factorial(number);
		}
		
		return total;
	}
	private static double factorial(double n) {
		double rs=n;
		while(n>1) {
			n--;
			rs*=n;
		}
		return rs;
	}
}
