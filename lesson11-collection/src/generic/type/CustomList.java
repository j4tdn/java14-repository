package generic.type;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class CustomList<Element> implements IList<Element> {

	private int size;
	/*
	 * size là số lượng phần tử non-null trong mảng
	 */
	
	private int initialCapacity = 8;
	/*
	 * mặc định nếu new CustomList ra mà không truyền initialCapacity vào 
	 * thì nó sẽ tạo mảng có length mặc định là 8
	 */
	// Generic --> declaration type --> exist at compile time
	private Element[] elements;
	
	public CustomList() {
		elements = createGenericArray(initialCapacity);
	}
	
	public CustomList(int capacity) {
		if(capacity <= 0) {
			throw new IllegalArgumentException("Capacity should be greater than 0");
		}
	    if(capacity > initialCapacity) {
	    	initialCapacity = capacity;
	    }
	    elements = createGenericArray(initialCapacity);
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isNotEmpty() {
		return size != 0;
	}

	@Override
	public boolean add(Element element) {
		/*
		 * Khi add thì xảy ra hai trường hợp  
		 */
		if (size < elements.length) {
			elements[size++] = element;
			return true;
		}
		elements = grow(element);
		return true;
	}

	@Override
	public boolean remove(int i) {
		return false;
	}

	@Override
	public boolean remove(Element e) {
		return false;
	}

	@Override
	public void set(int i, Element e) {
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		elements[i] = e;
	}

	@Override
	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.println(elements[i]);
		}		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int count(Predicate<Element> predicate) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (predicate.test(elements[i])) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Element get(int i) {
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		return elements[i];
	}
	
	@SuppressWarnings("unchecked")
	private Element[] createGenericArray(int size) {
		return (Element[]) Array.newInstance(Object.class, size);
	}
	
	private Element[] grow(Element newElement) {
		// context: size = length
		
		Element[] newElements = createGenericArray(size + initialCapacity);
		// copy 
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		// add new element
		newElements[size++] = newElement;
		
		return newElements;
	}

}
