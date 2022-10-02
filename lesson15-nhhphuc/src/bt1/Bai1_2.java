package bt1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.println("Nhập phần tử: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
        	result(map, arr[i]);
        }
        System.out.print("Kết quả: ");
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }

    public static void result(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
}
