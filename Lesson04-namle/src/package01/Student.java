package package01;

import java.util.Scanner;

public class Student {
	private int id;
	private String fullname;
	private float theorypoin, practicepoin;
	public Student() {
	}
	
	
	public Student(int id, String fullname, float theorypoin, float practicepoin) {
		this.id = id;
		this.fullname = fullname;
		this.theorypoin = theorypoin;
		this.practicepoin = practicepoin;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public float getTheorypoin() {
		return theorypoin;
	}
	public void setTheorypoin(float theorypoin) {
		this.theorypoin = theorypoin;
	}
	public float getPracticepoin() {
		return practicepoin;
	}
	public void setPracticepoin(float practicepoin) {
		this.practicepoin = practicepoin;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", theorypoin=" + theorypoin + ", practicepoin="
				+ practicepoin + "]";
	}
	
	public float mediumScore()
	{
		return (float)((theorypoin + practicepoin ) / 2);
	}
	public void input ()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("input id:");
		id = Integer.parseInt(ip.nextLine());
		System.out.println("input full name:");
		fullname = ip.nextLine();
		System.out.println("input theorypoin:");
		theorypoin = Float.parseFloat(ip.nextLine());
		System.out.println("input practiepoin:");
		practicepoin = Float.parseFloat(ip.nextLine());
	}
}
