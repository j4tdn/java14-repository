package package05;

public class TextBook extends Book {
	private String status;

	public TextBook() {
	}

	public TextBook(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [status=" + status + "]";
	}

	
}
