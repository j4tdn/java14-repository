package view.stream.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex06TransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("1. ===================");
		transactions.stream()
					.filter(t -> t.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("2. ===================");
		transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted(Comparator.comparing(t -> t.getTrader().getCity())) // Transaction implement Comparable<Transaction>
					.forEach(System.out::println);
		
		
		
		// 3. What are all the unique cities where the traders work?
		System.out.println("3. ===================");
		transactions.stream()
					.map(t -> t.getTrader().getCity())
					.distinct()
					.forEach(System.out::println);
		
		// 4. Find all traders from Cambridge and sort them by name descending.
		System.out.println("4. ===================");
		transactions.stream()
					.map(Transaction::getTrader)
					.filter(t -> "Cambridge".equals(t.getCity()))
					.sorted(Comparator.comparing(Trader::getName, Comparator.reverseOrder()))
					.forEach(System.out::println);
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("5. ===================");
		String traders = transactions.stream()
					.map(t -> t.getTrader().getName())
					.distinct()
					.sorted()
					.collect(Collectors.joining(", "));
		System.out.println(traders);
		
		
		// 6. Are any traders based in Milan?
		System.out.println("6. ===================");
		boolean hasMiLanTrader = transactions.stream()
					.anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
		System.out.println(hasMiLanTrader);
		
		// 7. Count the number of traders in Milan.
		System.out.println("7. ===================");
		long count = transactions.stream()
					.filter(t -> "Milan".equals(t.getTrader().getCity()))
					.count();
		System.out.println("count: " + count);
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		// Transaction -> trader, value
		System.out.println("8. ===================");
		transactions.stream()
				    .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				    .map(Transaction::getValue)
				    .distinct()
				    .forEach(System.out::println);
		
		// 9. What’s the highest value of all the transactions?
		System.out.println("9. ===================");
		OptionalInt maxValueOpt = transactions.stream()
					.mapToInt((Transaction::getValue)) // IntStream
					.max();
		maxValueOpt.ifPresent(max -> System.out.println(max));
		
		// 10. Find the transaction with the smallest value.
		System.out.println("10. ===================");
		Optional<Transaction> transactionOpt = transactions.stream()
					.reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
		transactionOpt.ifPresent(minT -> System.out.println(minT));
	}
}
