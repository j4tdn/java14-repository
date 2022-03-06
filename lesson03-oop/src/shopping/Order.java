package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDateTime dateCreated;
	private double totalOfMoney;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetail, LocalDateTime dateCreated) {
		this.customer = customer;
		this.itemDetail = itemDetail;
		this.dateCreated = dateCreated;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail[] itemDetail) {
		this.itemDetail = itemDetail;
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
		return "ORDER: Customer = " + customer +"\nItem Detail =" + Arrays.toString(itemDetail) + "\nDate Created = "
				+ dateCreated + "]";
	}
	
	
}
