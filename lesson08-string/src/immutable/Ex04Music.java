package immutable;

import java.util.Arrays;

/*
Bài tập 1:
	   Viết chương trình in ra danh sách tên bài nhạc mp3 có trong thư mục music
	   Input: String bh1=d:/music/somthingyoulike.mp3
	              String bh2
	              String bh3
	                              d:/music/foreoverandone.mp3
	                              d:/music/takemetoyourheart.mov 
	   String [] arrStr={bh1, bh2, bh3}
	   Output:
	   Danh sach bai hat mp3 trong thu muc d:/music
	         1   somthingyoulike
	         2.  foreoverandone
	     
	      
	      */
public class Ex04Music {
	public static void main(String[] args) {
		String bh1="d:/music/somthingyoulike.mp3";
		String bh2="d:/music/foreoverandone.mp3";
		String bh3="d:/music/takemetoyourheart.mov";
		String [] songs= {bh1,bh2,bh3};
		System.out.println(Arrays.toString(listSongWithMp3(songs)));
		
	}
	private static String[] listSongWithMp3(String[] songs) {
		String []rs= new String [songs.length];
		int i=0;
		for(String song:songs) {
			if(song.endsWith("mp3")) {
				rs[i++]=song.substring(song.lastIndexOf("/")+1,song.lastIndexOf("."));
			}
		}
		return Arrays.copyOfRange(rs, 0, i);
	}
}
