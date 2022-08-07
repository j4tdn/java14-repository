package view.stream.practice;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.Transaction;
import model.DataModel;

public class Ex06TransactionApp {
	public static void main(String[] args) {
		
		List<Transaction> transactions = DataModel.getTransaction();
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
		transactions.stream()
					.filter(tr -> tr.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.forEach(System.out::println);
//		2. Find all transactions have value greater than 300 and sort them by trader’s city filter,sort
		System.out.println();
		transactions.stream()
					.filter(tr -> tr.getValue() >300)
					.sorted(Comparator.comparing(tr ->tr.getTrader().getCity()))
					.forEach(System.out::println);
		
//		3. What are all the unique cities where the traders work? // map, distinct
		System.out.println();
		
		
//		4. Find all traders from Cambridge and sort them by name desc. ,map filter, sort reverse
		
//		5. Return a string of all traders’ names sorted alphabetically., map, sort,distinct function.identity
		
		transactions.stream()
					.map(tr -> tr.getTrader().getName())
					.sorted()
					.distinct()
					.forEach(System.out::println);
		
//		6. Are any traders based in Milan?  // anyMatch
		
		boolean is = transactions.stream()
					.anyMatch(tr ->tr.getTrader().getCity().equals("Milan"));
		System.out.println(is);
		
//		7. Count the number of traders in Milan. // filter count
		
//		8. Print all transactions’ values from the traders living in Cambridge. filter,map
		
//		9. What’s the highest value of all the transactions? ,mapToInt reduce
		
//		10. Find the transaction with the smallest value.  reduce
	}
}
