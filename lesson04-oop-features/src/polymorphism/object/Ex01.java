package polymorphism.object;

public class Ex01 {
	public static void main(String[] args) {
		Shape shape= new Shape();
		shape.draw();
		
		Square square= new Square();
		square.draw();
		
		Rectangle rectangle= new Rectangle();
		rectangle.draw();
		
		System.out.println("========");
		
		Shape s1= new Square();
		s1.draw();
		Shape s2= new Rectangle();
		s2.draw();
		
		// Tại sao mình không new đối tượng trực tiếp từ KDL của nó
		// mà phải lấy Cha new Con
		// Cha-Con, !Anh-Em
		// 1. Dễ dàng ép kiểu qua về giữa những KDL của lớp con lúc runtime
		// 2. Tạo ra 1 mång Shape vừa có thể là Square vừa là Rectangle I
		Square s3 = new Square();
		Square s4 = new Square();
		Square s5 = new Square();
		Square[] squares = {s3, s4, s5};
//		for (Square s:squares) {
//			s.calculate();
//		}
		Rectangle s6 = new Rectangle();
		Rectangle s7 = new Rectangle();
		Rectangle[] rectangles = {s6, s7};
//		for (Rectangle ri: rectangles) {
//		    ri.calculate();
//		}
		// Cách làm ==>
		Shape[] shapes ={ s3, s4, s5, s6, s7 };
		for (int i= 0; i < shapes.length; i++) {
		    System.out.print("i" + i + ">» ");
		   shapes[i].calculate();
		}
	}
		          
		
		          
		
}
