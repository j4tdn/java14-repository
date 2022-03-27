package bai5;

public class ReferBook {
private String masach;
private String dongia;
private String nhaxuatban;
private String thue;
public ReferBook(String masach, String dongia, String nhaxuatban, String thue) {
	super();
	this.masach = masach;
	this.dongia = dongia;
	this.nhaxuatban = nhaxuatban;
	this.thue = thue;
}
public String getMasach() {
	return masach;
}
public void setMasach(String masach) {
	this.masach = masach;
}
public String getDongia() {
	return dongia;
}
public void setDongia(String dongia) {
	this.dongia = dongia;
}
public String getNhaxuatban() {
	return nhaxuatban;
}
public void setNhaxuatban(String nhaxuatban) {
	this.nhaxuatban = nhaxuatban;
}
public String getThue() {
	return thue;
}
public void setThue(String thue) {
	this.thue = thue;
}
@Override
public String toString() {
	return "Sachthamkhao [masach=" + masach + ", dongia=" + dongia + ", nhaxuatban=" + nhaxuatban + ", thue=" + thue
			+ "]";
}
}
