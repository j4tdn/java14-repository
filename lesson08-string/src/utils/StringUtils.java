package utils;

public class StringUtils {
	private StringUtils() {
		
	}
	public static void hash(Object text, Object object) {
		System.out.println(text+" =>>> " +System.identityHashCode(object));
	}
}
