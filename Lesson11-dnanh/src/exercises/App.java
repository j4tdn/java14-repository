package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		Trader raoul = new Trader("raoul", "Cambridge");
		Trader mario = new Trader("mario", "Milan");
		Trader alan = new Trader("alan", "Cambridge");
		Trader brian = new Trader("brian", "Cambridge");
		
		List<Trader> listTraders = new ArrayList<>();
		listTraders.add(brian);
		listTraders.add(mario);
		listTraders.add(alan);
		listTraders.add(brian);
		
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
				);
		
		System.out.println("========================================");
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		List<Transaction> getTransactionByYears = new ArrayList<>();
		for(Transaction element : transactions) {
			if(element.getYear() == 2011) {
				getTransactionByYears.add(element);
			}
		}
		getTransactionByYears.sort(Comparator.comparing(Transaction::getValue));
		getTransactionByYears.forEach(System.out::println);
		
		
		System.out.println("========================================");
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		List<Transaction> getTransactionByValue = new ArrayList<>();
		for(Transaction element : transactions) {
			if(element.getValue() >= 300) {
				getTransactionByValue.add(element);
			}
		}
		getTransactionByValue.sort(Comparator.comparing(tr -> tr.getTrader().getCity()));
		getTransactionByValue.forEach(System.out::println);

	}
}
