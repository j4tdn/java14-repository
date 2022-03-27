package package05;

public class TextBook {
	private String id;
	private float price;
	private String publishingCompany;
	private boolean status;
	public TextBook() {
	}
	public TextBook(String id, float price, String publishingCompany, boolean status) {
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TextBook [id=" + id + ", price=" + price + ", publishingCompany=" + publishingCompany + ", status="
				+ status + "]";
	}
	
}
