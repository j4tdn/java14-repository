package ex04;

public class Utility {
	private Utility() {
	}
	public static String readADigit(int number) {
		switch (number) {
			case 0: return "không";
			case 1: return "một";
			case 2: return "hai";
			case 3: return "ba";
			case 4: return "bốn";
			case 5: return "năm";
			case 6: return "sáu";
			case 7: return "bảy";
			case 8: return "tám";
			case 9: return "chín";
		}
		return "";
	}
	public static String readTwoDigits(int number) {
		int units=number % 10;
		int tens=number / 10;
		if(units==0 ) {
			if(tens==1) {
				return "mười";
			}
			return readADigit(tens)+" mươi";
			
		}
		if(tens==1) {
			return "mười "+readADigit(units);
		}
		if(units == 5) {
			if(tens==1) {
				return "mười lăm";
			}
			return readADigit(tens)+" mươi lăm";
		}
		return readADigit(tens)+ " mươi "+readADigit(units);
	}
	public static String readThreeDigits(int number) {
		int tr = number/100;  // tr: hàng trăm
		int tens= (number%100)/10;
		int units= (number%100)%10;
		System.out.println(tr+ " "+tens+" "+units+" ");
		if(tr==0) {
			if(tens==0) {
				return readADigit(units);
			}
			return readTwoDigits(tens*10+units);
		}
		if(tr==1 && tens==0 ) {
			if(units==0) {
				return "một trăm";
			}
			if(units==5) {
				return "một trăm lẻ năm";
			}
			return "một trăm lẻ "+readADigit(units);
		}
		if(tens==0) {
			return readADigit(tr)+" trăm lẻ "+readADigit(units);
		}
		return readADigit(tr)+" trăm "+readTwoDigits(tens*10+units);
	}
	public static String readANumber(int number) {
		String [] s= {"", " nghìn"," triệu"," tỷ"}; 
		int []arr= new int[6];
		int count=0;
		while(number !=0){ // 702.212
			int value= number %1000; //value: 212
		
			arr[count++]=value;  // arr[0]:212
			
			number/=1000;			// number= 702.212/1000=702
			
			
		}
		count--;
	
		String rs="";
		while(count >=0) {
			System.out.println("arr:"+arr[count]);
			rs+= readThreeDigits(arr[count]) + s[count]+" ";
			count--;
		}
		return rs;
	}
}
