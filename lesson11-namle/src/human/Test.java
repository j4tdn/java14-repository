package human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utils.CollectionUtils;


public class Test {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		
		List<Trader> traders = new ArrayList<Trader>();
		traders.add(raoul);
		traders.add(mario);
		traders.add(alan);
		traders.add(brian);
		
//		List<Transation> transations = Arrays.asList(
//				new Transation(brian, 2011, 300),
//				new Transation(raoul, 2012, 1000),
//				new Transation(raoul, 2011, 400),
//				new Transation(mario, 2012, 710),
//				new Transation(mario, 2012, 700),
//				new Transation(alan, 2012, 950)
//				);
		
		
		List<Transation> transations = new ArrayList<Transation>();
		transations.add(new Transation(brian, 2011, 400));
		transations.add(new Transation(raoul, 2012, 1000));
		transations.add(new Transation(raoul, 2011, 300));
		transations.add(new Transation(mario, 2012, 710));
		transations.add(new Transation(mario, 2012, 700));
		transations.add(new Transation(alan, 2012, 950));
		// câu 1
		
//		CollectionUtils.printO(sortByYear(transations));
		CollectionUtils.printO(FintToCity(transations));
		
		// câu 2
//		CollectionUtils.printO(sortByValue(transations));

		
		
	
		
		
	}

	public static List<Transation> sortByYear(List<Transation> transations)
	{
		List<Transation> tranSortByValue = new ArrayList<Transation>();
		
		for(Transation transation : transations)
		{
			if(transation.getYear() == 2011)
			{
				tranSortByValue.add(transation);
			}
		}
		
		tranSortByValue.sort(Comparator.comparing(Transation::getValue));
		return tranSortByValue;
	}
	
	public static List<Transation> sortByValue(List<Transation> transations)
	{
		List<Transation> tranSortByValue = new ArrayList<Transation>();
		
		for(Transation transation : transations)
		{
			if(transation.getValue() > 300)
			{
				tranSortByValue.add(transation);
			}
		}
		tranSortByValue.sort(Comparator.comparing(Trader::getCity));
		
		return tranSortByValue;
	}
	
	
	public static List<Transation> FintToCity(List<Transation> transations)
	{
		List<Transation> tranSortByValue = new ArrayList<Transation>();
		List<Trader> trader= new ArrayList<>();
		
		
		for(Transation transation : transations)
		{
			if(transation.getCity().contains("Cambridge"))
			{
				tranSortByValue.add(transation);
				trader.add(transation);
				
			}
		}
		tranSortByValue.sort(Comparator.comparing(Transation::getCity));
		
		return tranSortByValue;
	}
}
