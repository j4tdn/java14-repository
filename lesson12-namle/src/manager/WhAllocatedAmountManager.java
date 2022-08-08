package manager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Store;

public class WhAllocatedAmountManager {
	public static void main(String[] args) {
		// B1
		final Integer whAllocationAmount = 300;

		// B2
		final List<Store> data = getItems();

		// B3

//        List<Store> data1 =  data.stream().filter(s -> s.getReferenceStoreId() != null).collect(Collectors.toList()).forEach(System.out::println);;
		List<Store> data1 = data.stream().filter(s -> s.getSelected()).collect(Collectors.toList());
		List<Store> data2 = new ArrayList<>();
		List<Store> data3 = data.stream().filter(s -> s.getSelected()).collect(Collectors.toList());
		float sum = 0.f;
		int count = 0;
		for (int i = 0; i < data1.size(); i++) {
			if (data1.get(i).getExpectedSales() != null) {
				
				
				count ++;
				sum = sum + data1.get(i).getExpectedSales().floatValue();
				data2.add(data1.get(i));
				
			} 
			
			
			else if (data1.get(i).getReferenceStoreId() != null) {
//				float sum = 0f;

				Long checkVId = data1.get(i).getReferenceStoreId();
				List<Store> temp = data1.stream().filter(s -> s.getStoreId().equals(checkVId))
						.collect(Collectors.toList());

//				temp.forEach(System.out::println);
//			
				for(int j = 0 ; j < temp.size();j++)
				{
					if (j == 0)
					{
						j = i;
						data3.get(j).setExpectedSales(temp.get(0).getExpectedSales());
					}
					else
					{
						
						data3.get(j).setExpectedSales(BigDecimal.valueOf(sum));
					}
				}
		

			}
			
		}
		System.out.println(sum + " " + count);
		
		data3.forEach(System.out::println);
	}

	private static List<Store> getItems() {
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), new Store(11L, null, bd(22), null, Boolean.FALSE));
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
	private Map<Long, Integer> doAllocation(List<Store> data, Integer whAllocationAmount) {
		// calculation
		// 
//		data.stream().filter(d -> d.getExpectedSales().equals(null)).collect(Collectors.toList());
//		List<Store> datas = new ArrayList<>();
//		for (Store d1 : data) {
//			if (d1.getExpectedSales() != null) {
//				datas.add(d1);
//			}
//
//			else if (d1.getReferenceStoreId() != null) {
//				List<Store> tmp = data.stream().filter(s -> s.getStoreId().equals(d1.getReferenceStoreId()))
//						.collect(Collectors.toList());
//				System.out.println(d1.getExpectedSales());
//
//				if (d1.getExpectedSales().equals(null)) {
//
//				}
//			}
//		}

		return null;

	}

}