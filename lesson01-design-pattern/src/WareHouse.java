	
public class WareHouse {
	private String address;
	private Integer minItems;
	private Integer maxItems;
	private String manager;
	
	
	public WareHouse address(String address) {
		this.address=address;
		return this;
	}
	public WareHouse minItems(Integer minItems) {
		this.minItems=minItems;
		return this;
	}
	public WareHouse maxItems(Integer maxItems) {
		this.maxItems=maxItems;
		return this;
	}
	public WareHouse manager(String manager) {
		this.manager=manager;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public Integer getMinItems() {
		return minItems;
	}
	public Integer getMaxItems() {
		return maxItems;
	}
	public String getManager() {
		return manager;
	}
	@Override
	public String toString() {
		return "WareHouse [address=" + address + ", minItems=" + minItems + ", maxItems=" + maxItems + ", manager="
				+ manager + "]";
	}
	
	
}
