package external;

public class Ex03 {
	public static void main(String[] args) {
		int i = 2;
		if (++i > 2 && i++ > 2) {
			i++;
		}

		if (++i > 4 || ++i > 5) {
			System.out.println(i);
		}
		
		if (i++ < 4 || ++i > 5) {
			System.out.println(i);
		}
int x = 0;
		int y = 0;
		for (int z = 0; z < 5; z++) {
			if ((++x > 2) && (++y > 2)) {
				x++;
			}
		}
		System.out.println(x + "  " + y);
	}
}
