package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService{
	@Override
	void login() {
		System.out.println("Login with username and password ....");
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("Verify by phone number ....");
	}
}