package singleton;

public class Ex02 {
	public static void main(String[] args) {
       DateTime dt1 = DateTime.getInstance();
       System.out.println(System.identityHashCode(dt1));
       System.out.println(dt1.now());
       DateTime dt2 = DateTime.getInstance();
       System.out.println(System.identityHashCode(dt2));
       System.out.println(dt2.now());
       DateTime dt3 = DateTime.getInstance();
       System.out.println(System.identityHashCode(dt3));
       System.out.println(dt3.now());
       
	}
}
