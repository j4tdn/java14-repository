package bt01;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(64, 4));
	}
	
	public static boolean isPowerOf(int x, int y) {
        double d = Math.log(Math.abs(x)) / Math.log(Math.abs(y));

        if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
            if (d == (int) d) {
                return true;
            } else {
                return false;
            }
        } else if (x > 0 && y < 0) {
            if ((int) d % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
