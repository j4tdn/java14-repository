package inheritance.newversion;

public interface Father {
	// abstract method - no body
	void adn(); // public abstract void adn()
	
	// normal method - default, static ==> JAVA08
	default void gaming() {
		System.out.println("contra, fifa, pes");
		salary();
	}
	
	static void coding() {
		System.out.println("C, C++");
	}
	
	// normal method - private ==> JAVA09
	private void salary() {
		System.out.println("unknown");
	}
	
	
}
