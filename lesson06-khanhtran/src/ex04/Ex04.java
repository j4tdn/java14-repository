package ex04;

public class Ex04 {
    public static void main(String[] args) {
		int n = 225;
		System.out.println(readThreeNumber(n));
	}
    
    public static int countNumberCharacter(int n) {
    	int result = 0;
    	while(n>0) {
    		result +=1;
    		n /= 10;
    	}
    	return result;
    }
    public static String readThreeNumber(int ip) {
    	String[] digits = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
    	if(ip<100) return readTwoNumber(ip);
    	if(ip-100<10) return digits[ip/100] + " Trăm Linh " + digits[ip%10];
    	return digits[ip/100] + " Trăm " + readTwoNumber(ip - (ip/100)*100);
    }
    public static String readTwoNumber(int ip) {
    	String[] digits = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
    	if(ip < 10) return digits[ip%10];
    	
    	switch (ip/10) {
			case 1:
				if(ip%10==5) {
					return "Mười Lăm";
				} else {
					return "Mười " + digits[ip%10];
				}
			default: {
				if(ip%10==1) {
					return digits[ip/10] + " Mươi Mốt";
				}
				if(ip%10==5) {
					return digits[ip/10] + " Mươi Lăm";
				}
				return digits[ip/10] + " Mươi " + digits[ip%10];
			}
		}
    }
}
