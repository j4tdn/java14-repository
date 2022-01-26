package ex01;

public class Prime {
    public static void main(String[] args) {
		int test = 200;
		//System.out.println(isPrime(test));
		System.out.println(nTh_PrimeNumber(test));
	}
    
    public static boolean isPrime(int n) {
    	if (n < 2)
    		return false;
    	for(int i = 2; i <= Math.sqrt(n); i++) {
    		if (n % i == 0)
    			return false;
    	}
    	return true;
    }
    // Hàm tìm số nguyên tố thứ n, e kém tiếng anh nên đặt tên hơi ngáo chút :))
    public static int nTh_PrimeNumber(int n) {
    	// Xét các th đặc biệt
    	if (n == 1)
    		return 2;
    	if (n == 2)
    		return 3;
    	// Khởi tạo biến count = 1 vì e tính số 2 trước
    	// Sau đó chỉ xét các số lẻ vì số chẵn luôn chia hết cho 2
    	int count = 1;
    	int result = 1;
    	// Dùng do while có vẻ sẽ tường minh hơn
    	while (count < n) {
    		result += 2;
    		if (isPrime(result)) {
    			count++;
    		}
    	}
    	return result;
    }
}
