package mutable;

import utils.StringUtils;

public class Ex01MutableVsImmutable {
	public static void main(String[] args) {
		// immutable & mutable
		// immutable: String || Literal & Object
		// mutable: StringBuilder & StringBuffer
		
		String i = "Box";
		StringUtils.hash("i", i);
		
		i = i.concat(" Layout");
		StringUtils.hash("i", i);
		
		System.out.println("==================");
		
		// StringBuilder sb = new StringBuilder("Builder");
		StringBuffer sb = new StringBuffer("Buffer");
		
		StringUtils.hash("sb", sb);
		
		sb.append(" Pattern");
		/*
		 * StringBuilder sau khi append xong thì nó trả về đối tượng, ô nhớ hiện tại
		 */
		StringUtils.hash("sb", sb);
		System.out.println("SB value: " + sb);
	}
}
