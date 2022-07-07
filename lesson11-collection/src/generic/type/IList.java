package generic.type;

import java.util.function.Predicate;

public interface IList<E> {
	boolean isEmpty();
	boolean isNotEmpty();
	boolean add(E e);
	boolean remove(int  index);
	boolean remove(E e);
	
	void set(int index,E e);
	E get (int index);
	
	int count(Predicate<E> predicate);
	int size();
}
