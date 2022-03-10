package Ex01;

import Ex01.Vehical;

public class Main {
	public static void main(String[] args) {
		Vehical[] vehicals = initialVehicals();
		taxCalculating(vehicals);
		
		System.out.println("Owner\t\t\tModel\t\t\tCapacity\tPrice\t\tTax");
		System.out.println("-------------------------------------------"
				+ "----------------------------------------------------");
		
		for(Vehical vehical:vehicals) {
			System.out.println(vehical.getOwner() + "\t\t" + 
							   vehical.getModel() + "\t\t" + 
							   vehical.getCapacity() + "\t\t" + 
							   vehical.getPrice() + "\t\t" + 
							   vehical.getTax());
		}
		
	}
	
	public static Vehical[] initialVehicals() {
		return new Vehical[] {
			new Vehical("Nguyen Van A", "Air Black", 150, 40000000),
			new Vehical("Nguyen Van B", "ZLX      ", 300, 60000000),
			new Vehical("Le Thi C"    , "Honda Cup", 50 , 20000000),
		};
	}
	
	public static void taxCalculating(Vehical[] vehicals) {
		for(Vehical vehical:vehicals) {
			double tax = 0;
			if(vehical.getCapacity()<100) {
				tax = vehical.getPrice()*0.01;
			}
			else if(vehical.getCapacity()>=100 && vehical.getCapacity()<=200) {
				tax = vehical.getPrice()*0.03;
			}
			else {
				tax = vehical.getPrice()*0.05;
			}
			vehical.setTax(tax);
		}
	}
}
