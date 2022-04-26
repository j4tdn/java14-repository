package Ex03;

public class EmailCheck {
	public void checkEmail(String str) throws EmailException{
		int check = str.indexOf('#');
		check = str.indexOf('#', check - 1);
		if(check != -1) {
			throw new EmailException("Không hợp lệ ");
		}
		System.out.println("Địa chỉ email đúng định dạng");
	}
}
