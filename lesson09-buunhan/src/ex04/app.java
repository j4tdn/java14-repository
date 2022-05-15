package ex04;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		System.out.print("Username: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
		String password = "";
		while(true) {
			System.out.print("Enter password: ");
			password = scanner.nextLine();
			try {
				if(getCheckPassWord(password));
				System.out.println("Register sucessfully !!!");
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private static boolean getCheckPassWord(String password) throws Exception {

		if (!password.matches("^.{8,}$"))
			throw new Exception("Password must contain at least 8 characters !!!");
		
		if (!password.matches("^.*[0-9]+.*$"))
			throw new Exception("Password must contain at least 1 digit ");

		if (!password.matches("^.*[A-Z]+.*$"))
			throw new Exception("Password must contrain at least one uppercase character!");
		
		if (!password.matches("^.*[^A-Za-z0-9]+.*$"))
			throw new Exception("Password must contain at least one special character");
		if(!password.matches(".*[a-z].*" ) ) {
			throw new Exception("PassWord must contain at least 1 lowercase character");
		}

	return true;
	}
}
