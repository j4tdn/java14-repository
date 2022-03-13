package builder;

public class Warehouse {

	private String address;
	private Integer minItems;
	private Integer maxItems;
	private String manager;

	public Warehouse address(String address) {
		this.address = address;
		return this;
	}

	public Warehouse minItems(Integer minItems) {
		this.minItems = minItems;
		return this;
	}

	public Warehouse maxItems(Integer maxItems) {
		this.maxItems = maxItems;
		return this;
	}

	public Warehouse manager(String manager) {
		this.manager = manager;
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
		return "Warehouse [address=" + address + ", minItems=" + minItems + ", maxItems=" + maxItems + ", manager="
				+ manager + "]";
	}
}