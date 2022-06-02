package sorting.primitive;

public interface Comparable {
	boolean compare(int pre,int next);
	
	static boolean asc(int pre,int next) {
		return pre>next;
	}
	static boolean desc(int pre,int next) {
		return pre<next;
	}
}
