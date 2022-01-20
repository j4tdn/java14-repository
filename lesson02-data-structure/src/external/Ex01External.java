package external;

import structure.Ex01TestMainMethod;

public class Ex01External {
	public static void main(String[] args) {
		// explain access modifier - public, private
		// public:  using in it's own class and everywhere
		// private: using in it's own class - internal
		
		// static: Method is static 
		// that can call directly via it's own ClassName
		
		Ex01TestMainMethod.anotherMain();
		// Ex01TestMainMethod.otherMethod();
		
		// Temporary: public | private static
	}
}
