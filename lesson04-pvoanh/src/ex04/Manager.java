package ex04;



public class Manager extends Person {
	private String name;
	private String birthdate;
	private double hsl;
	private int slnv;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, String birthdate, double hsl, int slnv) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.hsl = hsl;
		this.slnv = slnv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public double getHsl() {
		return hsl;
	}
	public void setHsl(double hsl) {
		this.hsl = hsl;
	}
	public int getSlnv() {
		return slnv;
	}
	public void setSlnv(int slnv) {
		this.slnv = slnv;
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.hsl*2200000;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", birthdate=" + birthdate + ", hsl=" + hsl + ", slnv=" + slnv +"salary=" +calculateSalary()+ "]";
	}
	
}
