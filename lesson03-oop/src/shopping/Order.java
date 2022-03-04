package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime dateCreated;
	private double totalMoney;

	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime dateCreated) {

		this.customer = customer;
		this.itemDetails = itemDetails;
		this.dateCreated = dateCreated;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	public double getTotalMoney() {
		return totalMoney;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", dateCreated="
				+ dateCreated + ", totalMoney=" + totalMoney + "]";
	}

	

}
