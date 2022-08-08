package manager;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import bean.Store;

public class WhAllocatedAmountManager {
	public static void main(String[] args) {
		// B1
		final Integer whAllocationAmount = 300;

		// B2
		final List<Store> data = getItems();
		doAllocation(data, whAllocationAmount);

		// B3

	}

//    private Long storeId;
//    private Long referenceStoreId;
//    private BigDecimal stockPreviousDay;
//    private BigDecimal expectedSales;
//    private Boolean isSelected;    
	private static List<Store> getItems() {
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), 
				new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), 
				new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), 
				new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), 
				new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), 
				new Store(11L, null, bd(22), null, Boolean.FALSE));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

	/**
	 * Do Allocation. Key: storeId with Long type Value: storeAllocatedAmount after
	 * calculation with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private static Map<Long, Integer> doAllocation(List<Store> data, Integer whAllocationAmount) {
		// Step One: Filling in missing “Expected Sales” values
		
		// Get storeId has referenceStoreId Which has ExpectValue and save it into Map<StoreId,ExpectValue>
		Map<Long, BigDecimal> maps = new LinkedHashMap<>();
		BigDecimal avgExpectedValue = bd(0);
		long count = 0;
		for (Store store : data) {
			if (store.getExpectedSales() != null) {
				avgExpectedValue = avgExpectedValue.add(store.getExpectedSales());
				count++;
			} else if(store.getSelected()){
					Optional<Store> hold = data.stream().filter(d -> d.getStoreId() == store.getReferenceStoreId())
							.findFirst();
					if (hold.isPresent() && hold.get().getExpectedSales() != null) {
						maps.put(hold.get().getStoreId(), hold.get().getExpectedSales());
					} else {
						continue;
					}
				}
		}
//		 Use Case 1: If a selected store is missing expected sales values and has a reference store maintained  use expected sales of reference store
    	for(Store store :data) {
    		if(store.getExpectedSales() == null && store.getSelected()) {
    			store.setExpectedSales(maps.get(store.getReferenceStoreId()));
    		}
    	}
    	//Use Case 2: If a store selected is missing expected sales values and has
    	//a) no reference store maintained OR
    	//b) a reference store maintained which is also missing expected sales itself
    	
    	// Calculate sumOfExpectValue, and sumOfStockPreDay
		BigDecimal sumOfExpectValue = bd(0);
		BigDecimal sumOfStockPreDay = bd(0);
		for(Store store :data) {
    		if(store.getExpectedSales() == null && store.getSelected() ) {
    			store.setExpectedSales(avgExpectedValue.divide(bd(count),1,RoundingMode.HALF_EVEN));
    		}
    		if(store.getExpectedSales() !=null && store.getSelected()) {
				sumOfExpectValue= sumOfExpectValue.add(store.getExpectedSales());
				sumOfStockPreDay = sumOfStockPreDay.add(store.getStockPreviousDay());
			}
    	}
		// After fill all missing value in Store_selected
		data.forEach(System.out::println);
		// sumOfExpectValue
		System.out.println(sumOfExpectValue);
		// sumOfStockPreDay
		System.out.println(sumOfStockPreDay);
		
		//Step Two: Calculation of “Allocation Key”
		Map<Long, BigDecimal> allocations = new LinkedHashMap<>();
		for(Store store :data) {
			if(store.getSelected()) {
				allocations.put(store.getStoreId(),store.getExpectedSales().divide(sumOfExpectValue,10, RoundingMode.HALF_UP) );
			}
		}
		
		// Step three
		Map<Long, Integer> result = new LinkedHashMap<>();
		for(Store store :data) {
			if(store.getSelected()) {
				Integer value = allocations.get(store.getStoreId()).multiply(bd(whAllocationAmount).add(sumOfStockPreDay)).subtract(store.getStockPreviousDay()).intValue();
				
				result.put(store.getStoreId(), value);
			}
		}
		result.forEach((k,v)->System.out.println(k + " " + v));
		return result;
	}

}
