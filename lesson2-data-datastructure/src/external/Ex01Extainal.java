package external;

import structure.Ex01TestMainMethod;

public class Ex01Extainal {
	public static void main(String[] args) {
		//Explain access modifier -- public, private
		// public: using in it's own class any everywhere
		//private: using in it's own class - in class
		
		//static: Method is static >> That can call directly(ten) it's own ClassName
		Ex01TestMainMethod.anotherMain();
	}
}
