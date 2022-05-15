package immutable;
import java.util.Arrays;
public class Ex04Music {
	public static void main(String[] args) {
		/*
		 * Viết chương trình in ra danh sách tên các bài nhạc mp3 có trong thư mục music
			Input: String bh1 = "d:/music/shapeofyou.mp3"
			String bh2 = "d:/music/allweknow.mp3"
			String bh3 = "d:/music/onmyway.mov"
			String [] paths = {bh1, bh2, bh3};
			Output: String[] songs = {"shapeofyou", "onmyway"};
		 */
		String[] paths= {
				"d:/music/shapeofyou.mp3",
				"d:/music/allweknow.mp3",
				"d:/music/onmyway.mov",
		};
		
		String[] mp3Songs = getMp3Songs(paths,".mp3");
		for(String song : mp3Songs) {
			System.out.println(song);
		}
	}
	
	private static String[] getMp3Songs(String[] paths,String extension) {
		String[] songs = new String[paths.length];
		int count = 0 ;
		for(String path:paths) {
			if(path.endsWith(extension)) {
				String song = path.substring(path.lastIndexOf("/") + 1 , path.lastIndexOf("."));
				songs[count++] = song;
			}
		}
		return Arrays.copyOfRange(songs,0,count);
	}
}
