package bean;

/*
 * 1. Find all transactions in the year 2011 and sort them by value (small to high).
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
public class Trader {
	private String name;
	private String city;
	public Trader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
}
