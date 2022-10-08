package ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String S = "abcaabbbbccaasb";
		char[] c = S.toCharArray();
		int count= 1 ,Max = -1; 
		char save = c[0];
		Arrays.sort(c);
		
		// aaaaabbbbbbccs
		for(int i = 0 ; i < c.length -1 ;i++)
		{
			
				if(c[i] == c[i+1])
				{
					count ++;
				}
				else
				{
					if(count >= Max)
					{
						Max = count;
						save = c[i];
						
					}
					count = 1;
				}
		}
		
		System.out.println(save);
		
	}

}
