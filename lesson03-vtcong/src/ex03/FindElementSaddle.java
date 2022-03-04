package ex03;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementSaddle {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		Element[] elements = elements(x, y);
		Element[] minElement = findMinSuddle(elements,x);
		Element[] maxElement = findMaxSuddle(elements,y);
//		System.out.println(Arrays.toString(maxElement));
		Element elementSuddle = checkPosition(minElement,maxElement);
		System.out.println(elementSuddle);
		
	}

	// tao du lieu cho cac phan tu
	private static Element[] elements(int x, int y) {
		Element[] elements = new Element[x * y];
		int count = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (count < x * y) {
					System.out.print("input value: " + i + "," + j + " : ");
					int value = input.nextInt();
					elements[count] = new Element(i, j, value);
					count++;
				}
			}
		}
		return elements;
	}

	// tim so nho nhat trong hang => tra ve 1 mang
	private static Element[] findMinSuddle(Element[] elements, int x) {
		Element[] minElements = new Element[x];
		for (int i = 0; i < x; i++) {
			int min = Integer.MAX_VALUE;
			for (Element element : elements) {
				if (element.getX() == i) {
					if (element.getValue() < min) {
						min = element.getValue();
						minElements[i] = element;
					}
				}
			}
		}
		return minElements;
	}
	
	// tim so lon nhat trong cot => tra ve 1 mang
	private static Element[] findMaxSuddle(Element[] elements, int y) {
		Element[] maxElements = new Element[y];
		for (int i = 0; i < y; i++) {
			int max = Integer.MIN_VALUE;
			for (Element element : elements) {
				if (element.getY() == i) {
					if (element.getValue() > max) {
						max = element.getValue();
						maxElements[i] = element;
					}
				}
			}
		}
		return maxElements;
	}
	
	
	//kiem tra vi tri cac phan tu trong 2 mang co giong nhau khong
	private static Element checkPosition(Element[] minSuddle,Element[] maxSuddle) {
		for(int i=0;i<minSuddle.length;i++) {
			for(int j=0;j<maxSuddle.length;j++) {
				if((minSuddle[i].getX()== maxSuddle[j].getX()) && (minSuddle[i].getY()== maxSuddle[j].getY())) {
					return minSuddle[i];
				}
			}
		}
		return null;
	}
		

}
