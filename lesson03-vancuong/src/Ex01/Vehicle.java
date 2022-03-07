package Ex01;

import java.util.Scanner;

public class Vehicle {
	private String Tenchuxe;
	private String Loaixe;
	private int Dungtich;
    private long Trigia;
	@Override
	public String toString() {
		return "Vehicle [Tenchuxe=" + Tenchuxe + ", Loaixe=" + Loaixe + ", Dungtich=" + Dungtich + ", Trigia=" + Trigia
				+ ", Thue=" + Thue + "]";
	}
	public String getTenchuxe() {
		return Tenchuxe;
	}
	public void setTenchuxe(String tenchuxe) {
		Tenchuxe = tenchuxe;
	}
	public String getLoaixe() {
		return Loaixe;
	}
	public void setLoaixe(String loaixe) {
		Loaixe = loaixe;
	}
	public int getDungtich() {
		return Dungtich;
	}
	public void setDungtich(int dungtich) {
		Dungtich = dungtich;
	}
	public long getTrigia() {
		return Trigia;
	}
	public void setTrigia(long trigia) {
		Trigia = trigia;
	}
	public double getThue() {
		return Thue;
	}
	public void setThue(double thue) {
		Thue = thue;
	}
	public Vehicle(String tenchuxe, String loaixe, int dungtich, long trigia, double thue) {
		super();
		Tenchuxe = tenchuxe;
		Loaixe = loaixe;
		Dungtich = dungtich;
		Trigia = trigia;
		Thue = thue;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	private double Thue;
	public void setTenchuxe(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	public void setTrigia(double nextDouble) {
		// TODO Auto-generated method stub
		
	}
	public void setThue(String nextLine) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
 
    