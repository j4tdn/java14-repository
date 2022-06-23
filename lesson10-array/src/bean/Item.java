package bean;

public class Item implements Comparable<Item>{
	private Integer Id;
	private String name;
	private Double price;

	public Item() {

	}

	public Item(Integer id, String name, Double price) {
		this.Id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [Id=" + Id + ", name=" + name + ", price=" + price + "]";
	}

	
	@Override
	// this.compareTo(o)
	// this: previous
	// o: next
	public int compareTo(Item o) {
		// Ascending by Id
		Item o1 = this;
		Item o2 = o;
		
		int comparedId = o1.getId() - o2.getId();
		
		if(comparedId != 0 )  return comparedId;
		
		// o1 id = o2 id
		
		// ascending by Price
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
