package bean;

public class Rectangle {
	
	// attribute -: 
	public int height;
	public int width;
	
	// empty constructor
	

	public int getHeight() {
		return height;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.width+","+this.height;
	}
}