package Ex04;

public class Main {
public static void main(String[] args) {
	Manager manager = new Manager("Hoang","1999",2,1);
	President president = new President("Nam","1998",3,2);
	Staff staffOne = new Staff("Viet","2000",1,"BE");
	Staff staffTwo = new Staff("Linh","2000",1,"FE");
	System.out.println("President: "+ president.getName()+"     ||  Old: " + president.getDate() + "||    Salary: " 
	+ (president.getNumSalary() + president.getNumDuty())* 30000000);
	System.out.println("Manager:   "+ manager.getName()+"   ||  Old: " + manager.getDate() + "||    Salary: " 
			+ (manager.getNumSalary()* 22000000));
	System.out.println("Staff:     "+ staffOne.getName()+"    ||  Old: " + staffOne.getDate() + "||    Salary: " 
			+ (staffOne.getNumSalary()* 12500000));
	System.out.println("Staff:     "+ staffTwo.getName()+"    ||  Old: " + staffTwo.getDate() + "||    Salary: " 
			+ (staffTwo.getNumSalary()* 12500000));
}

}
