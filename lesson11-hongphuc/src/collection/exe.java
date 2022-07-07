package collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import utils.CollectionsUtils;

public class exe {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("mario", "Milan");
		Trader alan  = new Trader("alan" , "Cambridge");
		Trader brian = new Trader("brian", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300 ),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400 ),
				new Transaction(mario, 2012, 710 ),
				new Transaction(mario, 2012, 700 ),
				new Transaction(alan , 2012, 950 ));
		
		
		List<Transaction> t = getTrans(transactions);
		t.sort((o1, o2)->o1.getValue() - o2.getValue());
		CollectionsUtils.printI(transactions);
	}
	
	public static List<Transaction> getTrans(List<Transaction> transactions2){
		List<Transaction> transactions = Arrays.asList();
		for(Transaction e:transactions2) {
			if(e.getYear()==2011) {
				transactions.add(e);
			}
		}
		return transactions;
	}
}
