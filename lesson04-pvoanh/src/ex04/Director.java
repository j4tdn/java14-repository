package ex04;


public class Director  extends Person{
	private String name;
	private String birthdate;
	private double hsl;
	private double hscv;
	public Director() {
		
	}
	public Director(String name, String birthdate, double hsl, double hscv) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.hsl = hsl;
		this.hscv = hscv;
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
	public double getHscv() {
		return hscv;
	}
	public void setHscv(double hscv) {
		this.hscv = hscv;
	}
	@Override
	public double calculateSalary() {
		return (this.hsl + this.hscv)*1250000;
	}
	@Override
	public String toString() {
		return "Director [name=" + name + ", birthdate=" + birthdate + ", hsl=" + hsl + ", hscv=" + hscv + "salary=" +calculateSalary()+"]";
	}
	

}
