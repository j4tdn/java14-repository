package inheritance.abstractclass;

public abstract class EmailService {
	// override required: abstract method
	abstract void login();
	
	// override optional
	void loginWith2Steps() {
		
	}
}