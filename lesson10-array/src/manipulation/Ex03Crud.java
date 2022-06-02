package manipulation;

import utils.ArrayUtils;

public class Ex03Crud {
	public static void main(String[] args) {
		int[]elements= {1,9,5,36,12,33};
		try {
			int []addElements=insert(elements, 4, 0);
			ArrayUtils.printf(addElements);
			int []remove=remove1(elements, 5);
			ArrayUtils.printf(remove);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	private static int[] remove(int [] source,int k) {
		if(k >=source.length || k<0) {
			throw new IllegalArgumentException("Inserted position must in["+0+", "+source.length+"]");
		}
		int[] rs= new int[source.length-1];
		for(int i=0;i<rs.length;i++) {
			if(i<k) {
				rs[i]=source[i];
			}
			else if(i >= k) {
				rs[i]=source[i+1];
			}
		}
		return rs;
	}
	private static int[] remove1(int [] source,int k) {
		if(k >=source.length || k<0) {
			throw new IllegalArgumentException("Inserted position must in["+0+", "+source.length+"]");
		}
		int[] rs= new int[source.length-1];
		for(int i=0;i<k;i++) {
			rs[i]=source[i];
		}
		for(int i=k;i<rs.length;i++) {
			rs[i]=source[i+1];
		}
		return rs;
	}
	private static int[] insert(int []elements,int newValue,int index) {
		if(index >elements.length || index<0) {
			throw new IllegalArgumentException("Inserted position must in["+0+", "+elements.length+"]");
		}
		int[] rs= new int[elements.length+1];
		
		for(int i=0;i<rs.length;i++) {
			if(i<index) {
				rs[i]=elements[i];
			}
			else if(i>index) {
				rs[i]=elements[i-1];
			}
		}
		rs[index]=newValue;
	
		return rs;
	}
	private static int[] add(int []elements,int newValue,int index) {
		if(index >elements.length || index<0) {
			throw new IllegalArgumentException("Inserted position must in["+0+", "+elements.length+"]");
		}
		int[] rs= new int[elements.length+1];
		
		for(int i=0;i<elements.length;i++) {
			rs[i]=elements[i];
		}
		for(int i=rs.length-1;i>index;i--) {
			rs[i]=rs[i-1];
		}
		rs[index]=newValue;
		return rs;
	}
}
