package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private itemDetail[] itemDetals;
	private LocalDateTime dateCreated;
	private double totalOfMoney;
	public Order() {
		
	}

	public Order(Customer customer, itemDetail[] itemDetals, LocalDateTime dateCreated) {
		super();
		this.customer = customer;
		this.itemDetals = itemDetals;
		this.dateCreated = dateCreated;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public itemDetail[] getItemDetals() {
		return itemDetals;
	}

	public void setItemDetals(itemDetail[] itemDetals) {
		this.itemDetals = itemDetals;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public double getTotalOfMoney() {
		return totalOfMoney;
	}

	public void setTotalOfMoney(double totalOfMoney) {
		this.totalOfMoney = totalOfMoney;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetals=" + Arrays.toString(itemDetals) + ", dateCreated="
				+ dateCreated + "]";
	}

	
	
}
