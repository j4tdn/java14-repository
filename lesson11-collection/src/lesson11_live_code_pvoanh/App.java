package lesson11_live_code_pvoanh;
/*
 *  1. Find all transactions in the year 2011 and sort them by value (small to high).
	2. Find all transactions have value greater than 300 and sort them by trader’s city
	3. What are all the unique cities where the traders work?
	4. Find all traders from Cambridge and sort them by name desc.
	5. Return a string of all traders’ names sorted alphabetically.
	6. Are any traders based in Milan?
	7. Count the number of traders in Milan.
	8. Print all transactions’ values from the traders living in Cambridge.
	9. What’s the highest value of all the transactions?
	10. Find the transaction with the smallest value.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;

public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = mockTrans();
		List<Trader> traders = mockTraders();
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		transactionHasYear2011(transactions).forEach(System.out::println);
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		transactionHasValueGreater300(transactions).forEach(System.out::println);
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("3. What are all the unique cities where the traders work?");
		uniqueCities(traders).forEach(System.out::println);
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
		traderHasCityCambridge(traders).forEach(System.out::println);
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		traderNames(traders).forEach(System.out::println);
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("6. Are any traders based in Milan?");
		System.out.println(traderHasCityIsMiLan(traders));
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("7,Count the number of traders in Milan.");
		System.out.println(numberOfTraderLiveInMiLan(traders));
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
		printTransactionHasTraderLiveInCambridge(transactions);
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("9. What’s the highest value of all the transactions?");
		System.out.println(highestValueInTransactions(transactions));
		
		System.out.println("\n\n\n================\n\n\n");
		System.out.println("10. Find the transaction with the smallest value.");
		System.out.println(smallestValueInTransactions(transactions));
	}
	//1. Find all transactions in the year 2011 and sort them by value (small to high).
	private static List<Transaction> transactionHasYear2011(List<Transaction> transactions){
		List<Transaction> rs=  new ArrayList<>();
		for(Transaction tr : transactions) {
			if(tr.getYear() == 2011 ) {
				rs.add(tr);
			}
		}
		return rs;
	}
	//2. Find all transactions have value greater than 300 and sort them by trader’s city
	private static List<Transaction> transactionHasValueGreater300(List<Transaction> transactions){
		List<Transaction> rs=  new ArrayList<>();
		for(Transaction tr : transactions) {
			if(tr.getValue() > 300 ) {
				rs.add(tr);
			}
		}
		rs.sort(Comparator.comparing(tr -> tr.getTrader().getCity()));
		return rs;
	}
	//3. What are all the unique cities where the traders work?
	private static Set<String> uniqueCities (List<Trader> traders){
		Set<String> uniqueCT = new LinkedHashSet<>();
		for(Trader tr :traders) {
			uniqueCT.add(tr.getCity());
		}
		return uniqueCT;
	}
	
	//4. Find all traders from Cambridge and sort them by name desc.
	private static List<Trader> traderHasCityCambridge(List<Trader> traders){
		List<Trader> rs=  new ArrayList<>();
		for(Trader tr : traders) {
			if("Cambridge".equals(tr.getCity()) ) {
				rs.add(tr);
			}
		}
		rs.sort(Comparator.comparing(Trader::getName,Comparator.reverseOrder()));
		return rs;
	}
	
	//5. Return a string of all traders’ names sorted alphabetically.
	private static List<String> traderNames(List<Trader> traders){
		List<String> rs=  new ArrayList<>();
		for(Trader tr : traders) {
			rs.add(tr.getName());
		}
		rs.sort(Comparator.comparing(Function.identity()));;
		return rs;
	}
	//6. Are any traders based in Milan?
	private static boolean traderHasCityIsMiLan(List<Trader> traders){
		
		for(Trader tr : traders) {
			if("Milan".equals(tr.getCity())) {
				return true;
			}
		}
		return false;
	}
	//7,Count the number of traders in Milan.
	private static int numberOfTraderLiveInMiLan(List<Trader> traders){
			int count =0;
			for(Trader tr : traders) {
				if("Milan".equals(tr.getCity())) {
					count++;
				}
			}
			return count;
		}
	//8. Print all transactions’ values from the traders living in Cambridge.
	private static void printTransactionHasTraderLiveInCambridge(List<Transaction> transactions) {
		for(Transaction tr: transactions) {
			if("Cambridge".equals(tr.getTrader().getCity())) {
				System.out.println(tr);
			}
		}
	}
	//9. What’s the highest value of all the transactions?
	private static int highestValueInTransactions(List<Transaction> transactions) {
		int max = transactions.get(0).getValue();
		for(int i = 1;i<transactions.size();i++) {
			if(transactions.get(i).getValue() > max) {
				max = transactions.get(i).getValue();
			}
		}
		return max;
	}
	//10. Find the transaction with the smallest value.
	private static int smallestValueInTransactions(List<Transaction> transactions) {
		int min = transactions.get(0).getValue();
		for(int i = 1;i<transactions.size();i++) {
			if(transactions.get(i).getValue() < min) {
				min = transactions.get(i).getValue();
			}
		}
		return min;
	}
	private static List<Trader> mockTraders(){
		return Arrays.asList(    new Trader("Raoul", "Cambridge"),
								 new Trader("Mario", "Milan"),
								 new Trader("Alan", "Cambridge"),
								 new Trader("Brian", "Cambridge")
		);
	}
	private static List<Transaction> mockTrans() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(
								new Transaction(brian, 2011, 300),
								new Transaction(raoul, 2012, 1000), 
								new Transaction(raoul, 2011, 400),
								new Transaction(mario, 2012, 710), 
								new Transaction(mario, 2012, 700), 
								new Transaction(alan, 2012, 950)
							);
		return transactions;
	}
}
