package generic.type;

import java.util.function.Predicate;

public interface IList<Element> {
	boolean isEmpty();

	boolean isNotEmpty();

	boolean add(Element e);

	boolean remove(int i);

	boolean remove(Element e);

	void set(int i, Element e);

	void show();

	int size();

	int count(Predicate<Element> predicate);

	Element get(int i);

}