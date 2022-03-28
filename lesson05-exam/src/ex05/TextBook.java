package ex05;

public class TextBook extends Book {
    private boolean status;

	public TextBook() {
		super();
	}

	public TextBook(String id, double price, String publishingCompany, boolean status) {
		super(id, price, publishingCompany);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return super.toString() + " " + status;
	}

	@Override
	public double calculate() {
		if(status == false) {
			return price * 0.7;
		} else {
			return price;
		}
	}
}
