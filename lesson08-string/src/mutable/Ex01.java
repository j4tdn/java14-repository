package mutable;

import utils.StringUtils;

public class Ex01 {
	public static void main(String[] args) {
		//immutable vs mutable
		
		String i= "Box";
		StringUtils.hash("i ", i);
		
		i=i.concat(" Layout");
		StringUtils.hash("i", i);
		System.out.println("=====================");
		
		StringBuffer sb= new StringBuffer("Buider");
		StringUtils.hash("sb", sb);
		sb.append(" Pattern");
		StringUtils.hash("sb", sb);
		System.out.println("Sb value: "+sb);
	}
}
