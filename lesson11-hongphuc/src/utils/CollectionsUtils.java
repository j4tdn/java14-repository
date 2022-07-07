package utils;

import java.util.List;

import bean.Trader;
import bean.Transaction;

public class CollectionsUtils {
	public CollectionsUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printf(List<String> elements) {
		for (String e : elements) {
			System.out.println(e);
		}
	}
	
	public static void printO(List<Trader> elements) {
		for (Trader e : elements) {
			System.out.println(e);
		}
	}
	
	public static void printI(List<Transaction> elements) {
		for (Transaction e : elements) {
			System.out.println(e);
		}
	}
}
