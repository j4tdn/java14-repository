package baitapClass;

import java.util.Scanner;

public class NhanVien {
	// 
	private String name;
	private int age;
	private String adress;
	private double salary;
	private int totalHours;
	
	// contructor
	public NhanVien() {
	}
	public NhanVien(String name, int age, String adress, double salary, int totalHours) {
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.salary = salary;
		this.totalHours = totalHours;
	}
	// get, set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	@Override
	public String toString() {
		return name + ", " + age + ", " + adress + ", " + salary + ", " + totalHours; 
	}
	
	public void inputInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap name : ");
		name = scan.nextLine();
		System.out.println("Nhap age : ");
		age = Integer.parseInt(scan.nextLine());
		System.out.println("Nhap adress : ");
		adress = scan.nextLine();
		System.out.println("Nhap salary : ");
		salary = scan.nextDouble();
		System.out.println("Nhap TotalHours : ");
		totalHours = scan.nextInt();

	}
	public void printInfo() {
		System.out.println("Thông tin chi tiet của nhân viên");
		System.out.println("Ten Nhan Vien:  " + name);
		System.out.println("Tuoi Nhan Vien: " + age);
		System.out.println("Dia chi Nhan Vien: " + adress);
		System.out.println("Luong Nhan Vien: " + salary);
		System.out.println("Tong gio lam viec Nhan Vien: " + totalHours);
		System.out.println("Thuong:  " + bonusCal());
		System.out.println("Tong luong nhan vien : "+(salary + bonusCal()));
	}
	public double bonusCal() {
		double bonus;
		if(totalHours >= 200) {
			bonus = salary * 0.2;
		}
		else if(totalHours < 200 && totalHours >= 100) {
			bonus = salary * 0.1;
		}
		else {
			bonus = 0;
		}
		return bonus;
	}
}
