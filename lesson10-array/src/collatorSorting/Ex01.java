package collatorSorting;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		String [] letters= {"A", "Ấ", "a", "b", "ấ", "ẹ", "B", "E"};
		
		Collator collator= Collator.getInstance(Locale.US);
		collator.setStrength(Collator.TERTIARY);
		Arrays.sort(letters,collator);
		ArrayUtils.printf(letters);
		
	}
}
