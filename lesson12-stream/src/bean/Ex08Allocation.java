package bean;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.DataModel;

public class Ex08Allocation {
	public static void main(String[] args) {
		List<Store> stores = DataModel.getStores();

		// 1. Get all stores which have stock previous day greater than 15
		System.out.println("1. ==============================");
		
		List<Store> storesByStockCdn = stores.stream()
			  .filter(store -> store.getStockPreviousDay().compareTo(bd(15)) > 0)
			  .collect(Collectors.toList());
		storesByStockCdn.forEach(System.out::println);
		
		// 2. Get all stores which have stock previous day greater than expected sales today
		// 	  and sort them store id descending

		System.out.println("2. ==============================");
		
		stores.stream()
			  .filter(store -> store.getNonNullStockPreviousDay().compareTo(store.getNonNullExpectedSales()) > 0)
			  .sorted(Comparator.comparing(Store::getStoreId).reversed())
			  .forEach(System.out::println);
		
		
		
		// 3. Get stores have no reference store and return list of store ids
		System.out.println("3. ==============================");
		
		stores.stream()
			  .filter(store -> store.getReferenceStoreId() == null)
			  .map(Store::getStoreId)
			  .forEach(System.out::println);
		
		// 4. Distinct stores by stock previous day
		System.out.println("4. ==============================");

		stores.stream()
			  .map(Store::getStockPreviousDay)
			  .distinct()
			  .forEach(System.out::println);
		
		stores.stream()
			  .filter(distinctBy(store -> store.getStockPreviousDay()))
		      .forEach(System.out::println);


		
		// 5. Get first 2 stores with max expected sales 
		System.out.println("5. ==============================");
		
		stores.stream()
			  .filter(store -> store.getExpectedSales() != null)
			  .sorted(Comparator.comparing(Store::getExpectedSales, Comparator.reverseOrder()))
			  .limit(2)
			  .forEach(System.out::println);
		
		// 6. Get list of reference stores
		
		// 7. Is there any store has no expected sales
		
		/* 
		 * 8. Calculate and return list of store's expected sales which has no expected sales
		 * - store has not expected sales but
		 *   + has reference store which maintained expected sales 
		 *     --> use expected sales of reference store
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 *     
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 */
		
		// 9. Calculate sum of expected sales today
		
		// 10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store id
	}
	
	// closure
	private static <T, R> Predicate<T> distinctBy(Function<T, R> function){
		Set<R> storage = new HashSet<>();
		return t -> storage.add(function.apply(t));
	}
	
	private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }
}
