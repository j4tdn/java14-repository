package generic.type;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class CustomList<E> implements IList<E> {

	private static int initial_capacity = 8;
	private int capacity;
	private E[] elements;
	private int size;
	
	
	// compile same object , runtime must be an Type
	public CustomList() {
		elements =createGenericArray(initial_capacity);
	}
	public CustomList(int capacity) {
		if(capacity <= 0) {
			throw new IllegalArgumentException("Capacity should be greater than 0");
		}
		if(capacity > initial_capacity) {
			initial_capacity += capacity;
		}
		elements = createGenericArray(initial_capacity);
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isNotEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E e) {
		if(size < elements.length) {
			elements[size++] = e;
			return true;
		}
		elements = grow(e);
		return true;
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(E e) {
		int index = 0;
		for(int i=0;i< size;i++) {
			if(elements[i].equals(e)){
				index = i;
			}
		}
		if(index == 0)
			return false;
		for(int i= index;i<size;i++) {
			
		}
		return true;
	}

	@Override
	public void set(int index,E e) {
		if(index <0 || index >=size) {
			throw new ArrayIndexOutOfBoundsException("i");
		}
		elements[index]=e;
	}

	@Override
	public E get(int index) {
		return elements[index];
	}
	@Override
	public int count(Predicate<E> predicate) {
		int count =0;
		for(int i =0 ;i < size ;i++) {
			if(predicate.test(elements[i])) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int size() {
		return size;
	}
	private E[] createGenericArray(int size) {
		return (E[]) Array.newInstance(Object.class, size);
		
	}
	private E[] grow(E e) {
		// size == length
		E[]  newElements= createGenericArray(size + initial_capacity);
		for(int i=0;i<size;i++) {
			newElements[i]=elements[i];
		}
		newElements[size++]=e;
		return newElements;
	}
	

}
