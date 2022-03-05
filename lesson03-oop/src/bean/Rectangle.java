package bean;

public class Rectangle {
	// attribute - thuộc tính
	// >>> private || public
	private int width;
	private int height;

	// constructor empty
	public Rectangle() {

	}

	// constructor full parametters
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
}
