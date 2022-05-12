package multable;

import utils.StringUtils;

public class Ex01MultableVsImmultable {
	public static void main(String[] args) {
		// immultable & multable
		// immultable : String : litteral & object
		// multable : Stringbuilder & Stringbuffer

		String i = "Box";
		StringUtils.hash("i", i);

		i = i + "layout";
		StringUtils.hash("i", i);

		System.out.println("=============");
		
		//StringBuilder sb = new StringBuilder("Builder");
		StringBuffer sb = new StringBuffer("Bufer");
		StringUtils.hash("sb", sb);
		
		sb.append("Pattern");
		StringUtils.hash("sb", sb);
		System.out.println("SB value :" + sb);
		
		
	}
}
