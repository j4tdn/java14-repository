package package5;

public class ReferBook {
	private String id;
	private double price;
	private String publishingCompany;
	private double tax;

	public ReferBook() {

	}

	public ReferBook(String id, double price, String publishingCompany, double tax) {
		super();
		this.id = id;
		this.price = price;
		this.publishingCompany = publishingCompany;
		this.tax = tax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBooks [id=" + id + ", price=" + price + ", publishingCompany=" + publishingCompany + ", tax="
				+ tax + "]";
	}

}
