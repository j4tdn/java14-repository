package bean;

public class Rectangle {
	// attributes- thuộc tính
	private int height;
	private int width;
	
	//empty constructor 
	public Rectangle() {
		
	}
	
	//Constructor full parameters
	public Rectangle(int width, int heigth) {
		this.width=width;
		this.height=heigth;
	
	}
	
	//getter-setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return this.width + "," + this.height;
	}
}
