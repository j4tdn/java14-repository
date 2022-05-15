package polymorphism.object;

public class Ex01 {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		
		Square square = new Square();
		square.draw();
		
		// PMO : xảy ra	khi có class con kế thừa từ class cha
		// process: Compile, runtime(new)
		// compile : s1 --> Shape
		// runtime : s1 --> Square
		// s1.draw(): compile : Shape
		//			: draw : Square
		System.out.println("===========PMO=========");
		
		Shape s1 = new Square();
		s1.draw();
		
		Shape s2 = new Rectangle();
		s2.draw();
		
		
		
		// tại sao ko new đối tượng trực tiếp từ KDL của nó
		// mà phải lấy Cha new con()
		// 1.Tạo ra 1 mảng Shape vừa có thể là Shape vừa là rectangle
		// Cha con - !anhem
		
		
		Shape s3 = new Square();
		Shape s4 = new Square();
		Shape s5 = new Square();
		Shape[] squares = {s3,s4,s5};
		for(Shape si : squares) {
			si.calculate();
		}
		
		Shape s6 = new Rectangle();
		Shape s7 = new Rectangle();
		
		// Cach lam
		Shape[] shapes = {s3,s4,s5,s6,s7};
		for(int i=0; i<shapes.length;i++) {
			System.out.println("i" + i + ">> ");
			shapes[i].calculate();
		}
	}
}
