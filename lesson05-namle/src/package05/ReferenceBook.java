package package05;

public class ReferenceBook extends Book{

	private int tax;
	public ReferenceBook() {
	}
	public ReferenceBook(int tax) {
		super();
		this.tax = tax;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
}
