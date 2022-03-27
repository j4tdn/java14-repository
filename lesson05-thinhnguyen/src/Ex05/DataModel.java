package Ex05;
public class DataModel {
	public static Customer[] initialCustomer() {
    	return new Customer[] {
    		new Customer("KH01","Tom",070606011,"01 nguyen trai"),
    		new Customer("KH02","Jerry",070606012,"02 nguyen trai"),
    		new Customer("KH03","Cat",070606013,"03 nguyen trai"),
    	};
    }
	public static ReferBook[] initialReferBooks() {
    	return new ReferBook[] {
    		new ReferBook("STK001",20000,"NhiDong",10),
    		new ReferBook("STK002",30000,"KimDong",10),
    	};
    }
	public static TextBook[] initialTextBooks() {
    	return new TextBook[] {
    		new TextBook("SGK001",20000,"NhiDong","new"),
    		new TextBook("SGK002",21000,"KimDong","old"),
    		new TextBook("SGK003",22000,"KimDong","new"),
    	};
    }
}
