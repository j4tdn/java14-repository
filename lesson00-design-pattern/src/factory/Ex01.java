package factory;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01 {
	public static void main(String[] args) {
		Shape s1 = ShapeFactory.getShape(ShapeInstance.SQUARE);
		s1.draw(); // 3
		
		Shape s2 = ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		s2.draw(); // 2
		
		s1 = s2;
		s1.draw();
		
		System.out.println(); // swing-, javafx, winform, electron(js)
		JFrame frame = new JFrame("Ex01-Window");
		frame.setPreferredSize(new Dimension(200, 200));
		
		JButton button = new JButton("hello");
		button.setBorder(BorderFactory.createLineBorder(Color.red));
		frame.getContentPane().add(button);
		frame.setVisible(true);
	}
}
