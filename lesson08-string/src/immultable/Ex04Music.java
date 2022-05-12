package immultable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex04Music {
	public static void main(String[] args) {
		String[] paths = {"d:/music/somethingyoulike.mp3",
						  "d:/music/foreverandon.mp3",
				   		  "d:/music/takemeyourheart.mov"};

		String[] mp3Songs = nameMusic(paths,".mp3");
		for(String song:mp3Songs) {
			System.out.println(song);
		}
	}

	private static String[] nameMusic(String[] paths, String extension) {
		String[] namemusic = new String[paths.length];
		int count = 0;
		for (String path : paths) {
			if (path.endsWith(extension)) {
				String song = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
				namemusic[count++] = song;
			}
		}
		return Arrays.copyOfRange(namemusic, 0, count) ;
	}
}
