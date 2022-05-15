package bai3;


public class Ex01 {
	public static void main(String[] args) {
		
		
		String input = "Welcome   toJAVA10   class ";
		StringBuilder StrB = new StringBuilder(input);
		
		
		System.out.println("chuỗi sau khi đảo và loại bỏ khoảng trắng: ");
		
		
		System.out.println(StrB.reverse().toString());
		
		
		System.out.println(input.replaceAll("\\s\\s+", " ").trim());
		  
		System.out.println("============");
		
		
	}
}
