package sorting.collactor;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

import utils.ArrayUtils;

public class Ex01Collactor {
	public static void main(String[] args) {
		// UpperCase, LowerCase, Sign, UnSign
		String[] letters = {"A", "Ấ", "a", "b", "ấ", "ẹ", "B", "E"};
		// sort default
		Arrays.sort(letters);
		System.out.println("Default Sort ");
		ArrayUtils.printf(letters);
		
		Collator collator = Collator.getInstance(Locale.UK);
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(letters,collator);
		System.out.println("\nCollator.PRIMARY ==> ");
		ArrayUtils.printf(letters);
		
		//=============================================
		collator.setStrength(Collator.TERTIARY);
		Arrays.sort(letters,collator);
		System.out.println("\nCollator.TERTIARY ==> ");
		ArrayUtils.printf(letters);
		
		
	}
}
