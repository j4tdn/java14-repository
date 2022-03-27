package package05;

public class ReferenceBooks {
	private String id;
	private float price;
	private String publishingCompany;
	private float fax;

	public ReferenceBooks() {
	}

	public ReferenceBooks(String id, float price, String publishingCompany, float fax) {
		this.id = id;
		this.price = price;
		this.publishingCompany = publishingCompany;
		this.fax = fax;
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

	public float getFax() {
		return fax;
	}

	public void setFax(float fax) {
		this.fax = fax;
	}

	@Override
	public String toString() {
		return "ReferenceBooks [id=" + id + ", price=" + price + ", publishingCompany=" + publishingCompany + ", fax="
				+ fax + "]";
	}

}
