package bai5;

public class TextBook {
private String masach;
private String dongia;
private String nhaxuatban;
private boolean tinhtrang;
public TextBook(String masach, String dongia, String nhaxuatban, boolean tinhtrang) {
	super();
	this.masach = masach;
	this.dongia = dongia;
	this.nhaxuatban = nhaxuatban;
	this.tinhtrang = tinhtrang;
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
public boolean isTinhtrang() {
	return tinhtrang;
}
public void setTinhtrang(boolean tinhtrang) {
	this.tinhtrang = tinhtrang;
}
@Override
public String toString() {
	return "TextBook [masach=" + masach + ", dongia=" + dongia + ", nhaxuatban=" + nhaxuatban + ", tinhtrang="
			+ tinhtrang + "]";
}

}
