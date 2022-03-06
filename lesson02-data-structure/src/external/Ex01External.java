package external;

import structure.Ex01TestMainMethod;

public class Ex01External {
    public static void main(String[] args) {
		//Explain access modifier - public, private
    	//public:  using in it's own class add everywhere
    	//private: using in it's own class - internal
    	//static: Method is static >> That can call directly via it's own ClassName
    	Ex01TestMainMethod.anothermain();
    	// Temporary: public | private static 
	}
}
