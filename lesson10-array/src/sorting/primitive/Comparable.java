package sorting.primitive;

public interface Comparable {
	boolean compare(int pre, int next);
	
	// (pre, next) -> pre > next
	static boolean asc(int pre, int next) {
		return pre > next;
	}
	
	// (pre, next) -> pre < next
	static boolean desc(int pre, int next) {
		return pre < next;
	}
}
