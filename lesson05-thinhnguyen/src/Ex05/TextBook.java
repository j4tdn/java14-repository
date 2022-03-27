package Ex05;

public class TextBook {
	private String idTBook;
	private double priceTBook;
	private String publishingTBook;
	private String status;
	
	public TextBook() {
	}
	public TextBook(String idTBook, double priceTBook, String publishingTBook, String status) {
		this.idTBook = idTBook;
		this.priceTBook = priceTBook;
		this.publishingTBook = publishingTBook;
		this.status = status;
	}
	public String getIdTBook() {
		return idTBook;
	}
	public void setIdTBook(String idTBook) {
		this.idTBook = idTBook;
	}
	public double getPriceTBook() {
		return priceTBook;
	}
	public void setPriceTBook(double priceTBook) {
		this.priceTBook = priceTBook;
	}
	public String getPublishingTBook() {
		return publishingTBook;
	}
	public void setPublishingTBook(String publishingTBook) {
		this.publishingTBook = publishingTBook;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TextBook [idTBook=" + idTBook + ", priceTBook=" + priceTBook + ", publishingTBook=" + publishingTBook
				+ ", status=" + status + "]";
	}
	
}
