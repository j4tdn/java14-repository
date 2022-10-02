package view.stream.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex06TransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		transactions.stream()
					.filter(t -> t.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
		
		System.out.println("\n2. Find all transactions have value greater than 300 and sort them by trader’s city.");
		transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
					.forEach(System.out::println);
		
		System.out.println("\n3. What are all the unique cities where the traders work?");
		transactions.stream()
					.map(t -> t.getTrader().getCity())
					.distinct()
					.forEach(System.out::println);
		
		System.out.println("\n4. Find all traders from Cambridge and sort them by name descending.");
		transactions.stream()
					.map(Transaction::getTrader)
					.filter(t -> "Cambridge".equals(t.getCity()))
					.sorted(Comparator.comparing(Trader::getName,Comparator.reverseOrder()))
					.forEach(System.out::println);;
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically.");
		
		String nameTraders = transactions.stream()
					.map(t -> t.getTrader().getName())
					.distinct()
					.sorted()
					.collect(Collectors.joining(", "));
		System.out.println(nameTraders);
		System.out.println("\n6. Are any traders based in Milan?");
		
		boolean hasMilanTrader = transactions.stream()
					.anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
		System.out.println(hasMilanTrader);
		System.out.println("\n7. Count the number of traders in Milan.");
		
		long count = transactions.stream()
					.filter(t -> "Milan".equals(t.getTrader().getCity()))
					.count();
		System.out.println(count);
		System.out.println("\n8. Print all transactions’ values from the traders living in Cambridge.");
		
		transactions.stream()
					.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
					.map(t -> t.getValue())
					.distinct()
					.forEach(System.out::println);
		
		System.out.println("\n9. What’s the highest value of all the transactions?");
		Optional<Transaction> optMaxValue = transactions.stream()
													 .reduce((previous, next) -> {
														 return previous.getValue() > next.getValue() ? previous : next;
													 });
		optMaxValue.ifPresent(
				maxValue -> {
					transactions.stream()
								.filter(t -> t.getValue() == (maxValue.getValue()))
								.map(t -> t.getValue())
								.forEach(System.out::println);
				});
		
		System.out.println("\n10. Find the transaction with the smallest value.");
		Optional<Transaction> optMinValue = transactions.stream()
														.reduce((previous, next) -> {
															return previous.getValue() < next.getValue() ? previous : next;
														});
		optMinValue.ifPresent(
				minValue -> {
					transactions.stream()
								.filter(t -> t.getValue() == (minValue.getValue()))
								.map(t -> t.getValue())
								.forEach(System.out::println);
				});

		
	}
}
