package ex01;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		int[] Array = new int [20];
		int Max = -1;
//		int[] Array = {1,2,4,3,2,6,4,1,6,7,5,2,9,12,22,1,4};
		Random rd = new Random();
		int count = 0;
		Map<Integer, Integer> map = new TreeMap(); 
		
		for(int i = 0 ; i < Array.length;i++)
		{
		            Array[i] = 15 + rd.nextInt() % 10;
		            System.out.print(Array[i] + " ");
		            if(map.containsKey(Array[i]))
		            {
		            	count ++ ;
		            	map.put(Array[i], count);
		            }
		            else {
		            map.put(Array[i], 1);
		            
		            }
		}
		
		System.out.println("\nxuat hien 1 lan");
		Set<Integer> set = map.keySet();
		for(Integer key : set)
		{
			if(map.get(key) == 1)
			{
				System.out.print(key + " ");
			}
			
		}
		
		System.out.println("\nxuat hien nhieu hon 1 lan");
		for(Integer key : set)
		{
			if(map.get(key) > 1)
			{
				
				System.out.print(key + " ");
			}
			
		}
		
		
		
		
	
	}
}
