package package04;

public class Ex04 {

	public static void main(String[] args) {

		People[] people = inputPeople();

		showInfomation(people);

	}

	public static People[] inputPeople() {
		People direction = new Director("Le Dang Hoai Nam", "23/01/2001", 2, 3);
		People manager = new Manager("Le Thi Hoai Nhi", "24/01/2001", 2, 250);

		People staff1 = new Staff("Hai Le", "24/7/1990", 1, "Ke Toan");
		People staff2 = new Staff("Khanh Phan", "28/5/1995", 1, "Ke Toan");

		People[] people = new People[] { direction, manager, staff1, staff2 };

		return people;
	}

	public static void showInfomation(People[] people) {

		for (People people1 : people) {
			people1.showinfo();
			System.out.println( "	Salary :" + people1.salary());

		}

	}

}
