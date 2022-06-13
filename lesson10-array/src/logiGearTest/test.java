package logiGearTest;

public class test {
	public static void main(String[] args) {
		String ip="LogiGear VietNam";
		byte[] arr= ip.getBytes();
		int [] a= new int[255];
		for(int i=0;i<arr.length;i++) {
			int temp=ip.codePointAt(i);
			a[temp]++;
		}
		for(int i=0;i<ip.length();i++) {
			System.out.println(ip.charAt(i)+"-"+a[ip.codePointAt(i)]);
		}
		
	}
}
