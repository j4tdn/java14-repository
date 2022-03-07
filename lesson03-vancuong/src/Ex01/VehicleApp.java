package Ex01;

import java.util.*;

public class VehicleApp {
	static Scanner sc = new Scanner(System.in);

	static void nhapXe(Vehicle xe) {
		System.out.print("tên chủ xe");
		xe.setTenchuxe(sc.nextInt());
		sc.nextLine();
		System.out.print("Loại xe ");
		xe.setLoaixe(sc.nextLine());
		System.out.print("Dung tích");
		xe.setDungtich(sc.nextInt());
		System.out.print("Trị giá xe");
		xe.setTrigia(sc.nextDouble());
		;
		sc.nextLine();
		System.out.print("Thuế");
		xe.setThue(sc.nextLine());
	}

	public static void main(String[] args) {
		Vehicle v[] = null;
		int a, n = 0;
		boolean flag = true;
		do {
			System.out.println("1.Nhập thông tin và tạo N đối tượng xe");
			System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe");
			System.out.println("3.Nhập số khác để thoát");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
				n = sc.nextInt();
				v = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Xe thứ " + (i + 1));
					v[i] = new Vehicle();
					nhapXe(v[i]);
				}
				break;
			case 2:
				System.out.printf("%5s %5s %5s %10s %10s %8s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế");
				for (int i = 0; i < n; i++) {
					v[i].getThue();
				}
				break;
			default:
				System.out.println("bye");
				flag = false;
				break;
			}
		} while (flag);
	}
}
