package exersise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Exercise {
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
		
		List<Transaction> getTransYear = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getYear() == 2011) {
				getTransYear.add(transaction);
			}
		}
		getTransYear.sort(Comparator.comparing(Transaction::getValue));
		
		System.out.println("========================================");
		System.out.println("Find all transactions in the year 2011 and sort them by value (small to high).");
		List<Transaction> getTransValue = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getValue() >= 300) {
				getTransValue.add(transaction);
			}
		}
		getTransYear.sort((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		getTransYear.forEach(System.out::println);
		
		
		System.out.println("========================================");
		System.out.println("Find all transactions have value greater than 300 and sort them by trader’s city");
		Set<Trader> uniquePlace = new HashSet<>();
		uniquePlace.addAll(listTraders);
		uniquePlace.forEach(System.out::println);

		System.out.println("========================================");
		System.out.println("What are all the unique cities where the traders work?");
		List<Trader> getTraderFromCity = new ArrayList<>();
		for (Trader trader : listTraders) {
			if(trader.getCity().equals("Cambridge")) {
				getTraderFromCity.add(trader);
			}
		}
		getTraderFromCity.sort(Comparator.comparing(Trader::getName));
		getTraderFromCity.forEach(System.out::println);
		
		System.out.println("========================================");
		System.out.println("Find all traders from Cambridge and sort them by name desc.");
		StringBuilder stringName = new StringBuilder();
		listTraders.sort(Comparator.comparing(Trader::getName).reversed());
		for (Trader trader : listTraders) {
			stringName.append(trader.getName()+",");
		}
		System.out.println(stringName.toString());
		
		System.out.println("========================================");
		System.out.println("Are any traders based in Milan?");
		for (Trader trader : listTraders) {
			if(trader.getCity().equals("Milan")) {
				System.out.println(trader);
			}
		}
		System.out.println("========================================");
		System.out.println("Count the number of traders in Milan.");
		int count = 0 ;
		for (Trader trader : listTraders) {
			if(trader.getCity().equals("Milan")) {
				count++;
			}
		}
		System.out.println("amount of Trader based in Milan: " + count);
		System.out.println("========================================");
		System.out.println("Print all transactions’ values from the traders living in Cambridge.");
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getCity().equals("Cambridge")) {
				System.out.println(transaction);
			}
		}
		System.out.println("========================================");
		System.out.println("What’s the highest value of all the transactions?");
		transactions.sort(Comparator.comparing(Transaction::getValue));
		System.out.println("the highest value of all the transactions: " + transactions.get(0).getValue());
		System.out.println("========================================");
		System.out.println("Find the transaction with the smallest value.");
		int last = transactions.size();
		System.out.println("the smalles value of all the transactions: " + transactions.get(last-1));
		
 	}
}
