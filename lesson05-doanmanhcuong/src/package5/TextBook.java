package package5;

public class TextBook {
	private String id;
	private double price;
	private String publishingCompany;
	private String status;

	public TextBook() {

	}

	public TextBook(String id, double price, String publishingCompany, String status) {
		this.id = id;
		this.price = price;
		this.publishingCompany = publishingCompany;
		this.status = status;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Didacticism [id=" + id + ", price=" + price + ", publishingCompany=" + publishingCompany + ", status="
				+ status + "]";
	}

}
