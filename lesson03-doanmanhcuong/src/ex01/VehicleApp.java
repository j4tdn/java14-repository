package ex01;

import java.util.Scanner;

public class VehicleApp {
	static Scanner sc = new Scanner(System.in);

	static void nhapXe(Vehicle xe) {

		System.out.print("Nhập tên chủ xe: ");
		xe.setTenChuXe(sc.nextLine());
		sc.nextLine();
		System.out.println("Nhập loại xe:");
		xe.setLoaiXe(sc.nextLine());
		System.out.print("Nhập dung tích xe: ");
		xe.setDungTich(sc.nextInt());
		System.out.print("Nhập trị giá xe: ");
		xe.setTriGia(sc.nextDouble());
	}

	public static void main(String[] args) {
		Vehicle v[] = null;
		int a, n = 0;
		boolean flag = true;
		do {
			System.out.println("Bạn chọn làm gì!!!");
			System.out.println("1.Nhập thông tin và tạo các đối tượng xe");
			System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("Nhập số khác để thoát");
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
				System.out.printf("%10s %10s %10s %10s %8s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
						"Thuế");
				for (int i = 0; i < n; i++) {
					v[i].inThue();
				}
				break;
			default:
				System.out.println("Goodbye!!!!");
				flag = false;
				break;
			}
		} while (flag);
	}
}
