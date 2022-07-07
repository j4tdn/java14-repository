package utils;

import java.util.List;

import human.Transation;


public class CollectionUtils {
	private CollectionUtils() {
	}
	
	public static void printO(List<Transation> transations)
	{
		for(Transation transation : transations)
		{
			System.out.println(transation);
		}
	}
	

}
