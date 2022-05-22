package functional;

// Strategy, Predicate --> any name
// functional interface : interface with ONE abstract method
// functional interface can be replaced by a lambda expression
public interface Strategy {
	boolean test(int input);
}
