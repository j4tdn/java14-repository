package immutable;

public class Ex06FormatString {
	public static void main(String[] args) {
		String text = "wElCome   tO   jAvA14 ClaSs";
		System.out.println(format(text));
	}
	
	private static String format(String text) {
		String formatedText = "";
		String[] words = text.split("\\s+");
		for(String word: words) {
			String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			formatedText += formattedWord + " ";
		}
		return formatedText;
	}
}	
