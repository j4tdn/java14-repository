package bean;

import java.util.Comparator;

public class Transaction {
	
	private Trader traders;
	private int year;
	private int value;
	public Trader getTraders() {
		return traders;
	}
	public void setTraders(Trader traders) {
		this.traders = traders;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return  traders + ", " + year + ", " + value;
	}
	public Transaction(Trader traders, int year, int value) {
		this.traders = traders;
		this.year = year;
		this.value = value;
	}
	public Transaction() {
	}
	
	
}
