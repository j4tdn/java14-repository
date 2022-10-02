package bt5;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateUtils {
	public PredicateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static <T, R>Predicate<T> distinctByKey(Function<T, R> func){
		Set<R> keys = new HashSet<>();
		return student -> keys.add(func.apply(student));
	}
}
