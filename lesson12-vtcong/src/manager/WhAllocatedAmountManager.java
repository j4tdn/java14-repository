package manager;

import java.math.BigDecimal;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import bean.Store;

public class WhAllocatedAmountManager {
	public static void main(String[] args) {
        // B1
        final Integer whAllocationAmount = 300;

        // B2
        final List<Store> data = getItems();
        
        // B3
        
        Map<Long, Integer> result = doAllocation(data,whAllocationAmount);

    }

    private static List<Store> getItems() {
        return Arrays.asList(
            new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
                new Store(2L, null, bd(19), bd(20), Boolean.TRUE),
                new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
                new Store(4L, null, bd(14), bd(31), Boolean.TRUE),
                new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
                new Store(6L, null, bd(15), bd(30), Boolean.TRUE),
                new Store(7L, 2L, bd(15), null, Boolean.TRUE),
                new Store(8L, null, bd(12), bd(19), Boolean.TRUE),
                new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
                new Store(10L, 7L, bd(18), null, Boolean.TRUE),
                new Store(11L, null, bd(22), null, Boolean.FALSE)
        );
    }

    private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }

    /**
     * Do Allocation.
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     * @return map of storeId, storeAllocatedAmount
     */
    private static Map<Long, Integer> doAllocation(List<Store> data, Integer whAllocationAmount) {
        // calculation
    	// use case 1 :
    	Long lengthSelect =  data.stream().filter(store -> store.getStoreId() == null && store.getReferenceStoreId() == null).count();
    	if(lengthSelect == data.size()) {
    		System.out.println("Expected sales cannot be calculated. Please add"
    				+ "reference store or include stores with expected sales for interpolation");
    	}
    	int length = data.size();
    	for (int i = 0; i < length; i++) {
			if(data.get(i).getExpectedSales() == null && data.get(i).getReferenceStoreId() != null) {
				Long storeId = data.get(i).getReferenceStoreId();
				Store tempStore = getStore(data, storeId);
				if(tempStore.getExpectedSales() != null) {
					data.get(i).setExpectedSales(tempStore.getExpectedSales());
				}
				else {
					int count = 0;
					BigDecimal total = new BigDecimal(0);
					while(count < i) {
						count ++;
						if(data.get(count).getStoreId() == tempStore.getStoreId()) {	
							continue;
						}
						total = total.add(data.get(count).getExpectedSales());
					}
					data.get(i).setExpectedSales(total.divide(bd(count)));
				}
			}
		}
    	// use case 2:
    	BigDecimal totalExpectedSales = data.stream().map(Store::getExpectedSales).reduce(bd(0),BigDecimal::add);
    	for (Store store : data) {
			store.setAllowcationKey(store.getExpectedSales().divide(totalExpectedSales));
		}
    	
    	// use case 3:
    	BigDecimal totalStockPrevious = data.stream().map(Store::getStockPreviousDay).reduce(bd(0),BigDecimal::add);
    	for (Store store : data) {
			store.setAmountAllocated(bd(store.getAllowcationKey()
					.multiply(bd(whAllocationAmount).add(totalStockPrevious).subtract(store.getStockPreviousDay())).ROUND_HALF_UP));
		}
    	
    	BigDecimal totalAmountAllocated = data.stream().map(Store::getAmountAllocated).reduce(bd(0),BigDecimal::add);
    	if(totalAmountAllocated.compareTo(bd(whAllocationAmount)) != 0 ) {
    		System.out.println("Not Matches");
    	}
        return null;
    }
    
    private static Store getStore(List<Store> data,Long id) {
    	for (Store store : data) {
			if(store.getStoreId() == id) {
				return store;
			}
		}
    	return null;
    }
}
