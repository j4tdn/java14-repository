package ex05;

public class ReferBook extends Book {
    private double tax;

	public ReferBook() {
		super();
	}

	public ReferBook(String id, double price, String publishingCompany, double tax) {
		super(id, price, publishingCompany);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return super.toString() + " " + tax;
	}

	@Override
	public double calculate() {
		return price * (1 + tax);
	}
    
    
}
