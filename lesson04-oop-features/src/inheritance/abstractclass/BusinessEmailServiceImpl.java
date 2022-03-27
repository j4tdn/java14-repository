package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService  {
	@Override
	void login() {
		System.out.println("Login with username and password...");
		
	}
	@Override
	void loginwith2step() {
		// TODO Auto-generated method stub

		System.out.println("Verift by phone number...");
	}
	

}
