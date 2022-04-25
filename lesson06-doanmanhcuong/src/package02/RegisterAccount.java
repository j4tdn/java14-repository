package package02;

public class RegisterAccount {
	public static void main(String[] args) {
		String password1 = "Java14Developer";
		if (isValid(password1)) {
			System.out.println(password1 + " - Invalid Password!");
		} else {
			System.out.println(password1 + " - Valid Password");
		}
		String password2 = "Java14-Developer";
		if (isValid(password2)) {
			System.out.println(password2 + " - Invalid Password!");
		} else {
			System.out.println(password2 + " - Valid Password");
		}
	}

	public static boolean isValid(String password) {
		if (!((password.length() >= 8) && (password.length() <= 256))) {
			return false;
		}
		if (password.contains(" ")) {
			return false;
		}
		if (true) {
			int count = 0;
			for (int i = 0; i <= 9; i++) {
				String str1 = Integer.toString(i);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~")
				|| password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&")
				|| password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-")
				|| password.contains("+") || password.contains("/") || password.contains(":") || password.contains(".")
				|| password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?")
				|| password.contains("|"))) {
			return false;
		}
		if (true) {
			int count = 0;
			for (int i = 65; i <= 90; i++) {
				char c = (char) i;
				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		if (true) {
			int count = 0;
			for (int i = 97; i <= 122; i++) {
				char c = (char) i;
				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		return true;
	}
}
