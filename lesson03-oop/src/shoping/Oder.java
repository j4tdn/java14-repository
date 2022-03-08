package shoping;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Set;

public class Oder {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime dateCreated;
	private double doCalculation;
	public Oder() {
	}

	public Oder(Customer customer, ItemDetail[] itemDetails, LocalDateTime dateCreated) {
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
	public double getDoCalculation() {
		return doCalculation;
	}
	public void setDoCalculation(double doCalculation) {
		this.doCalculation = doCalculation;
	}

	@Override
	public String toString() {
		return "Oder [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", dateCreated="
				+ dateCreated + "]";
	}
	
}
