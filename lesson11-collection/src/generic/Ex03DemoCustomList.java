package generic;

import generic.type.CustomList;
import generic.type.IList;

public class Ex03DemoCustomList {
	public static void main(String[] args) {
		IList<Integer> digits = new CustomList<>();
		System.out.println("size : "+digits.size());
		digits.add(2);
		digits.add(5);
		digits.add(3);
		digits.add(19);
		digits.add(72);
		digits.add(312);
		digits.add(48);
		digits.add(32);

		for(int i=0;i<digits.size();i++) {
			System.out.print(digits.get(i)+" ");
		}
		System.out.println("size : "+digits.size());
		
		System.out.println("amount of even numbers = "+digits.count(n -> n%2==0));
	}
}
