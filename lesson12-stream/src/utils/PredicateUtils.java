package utils;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateUtils {
	private PredicateUtils() {};
	
	public static <R,T> Predicate<T> distinctByKey(Function<T, R> function){
		Set<R> keys = new HashSet<>();
		return k ->keys.add(function.apply(k));
	}
}
