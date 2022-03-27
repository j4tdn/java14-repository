package inheritance.newversion;

public interface Father {
	void adn();
	
	
	// normal method -default,static =>java08
	default void gaming() {
		System.out.println("contra, fifa.pes");
	}
	
	//private  => java09
	static void coding() {
		System.out.println("C,c++");
	}
	private void salary() {
		System.out.println("unknown");
	}
}
