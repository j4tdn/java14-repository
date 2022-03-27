package Ex05;

public class ReferBook {
	private String idReBook;
	private double priceReBook;
	private String publishingReBook;
	private double tax;
	
	public ReferBook() {
	}
	public ReferBook(String idReBook, double priceReBook, String publishingReBook, double tax) {
		this.idReBook = idReBook;
		this.priceReBook = priceReBook;
		this.publishingReBook = publishingReBook;
		this.tax = tax;
	}


	public String getIdReBook() {
		return idReBook;
	}

	public void setIdReBook(String idReBook) {
		this.idReBook = idReBook;
	}

	public double getPriceReBook() {
		return priceReBook;
	}

	public void setPriceReBook(double priceReBook) {
		this.priceReBook = priceReBook;
	}

	public String getPublishingReBook() {
		return publishingReBook;
	}

	public void setPublishingReBook(String publishingReBook) {
		this.publishingReBook = publishingReBook;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "ReferBook [idReBook=" + idReBook + ", priceReBook=" + priceReBook + ", publishingReBook="
				+ publishingReBook + ", tax=" + tax + "]";
	}
	
	
}
