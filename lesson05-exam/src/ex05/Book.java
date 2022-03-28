package ex05;

public abstract class Book {
    protected String id;
    protected double price;
    protected String publishingCompany;
    
    public Book() {
	}

	public Book(String id, double price, String publishingCompany) {
		super();
		this.id = id;
		this.price = price;
		this.publishingCompany = publishingCompany;
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
	
	public abstract double calculate();

	@Override
	public String toString() {
		return id + " " + price + " " + publishingCompany;
	}
}
