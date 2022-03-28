package package01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student sv1 = new Student(1, "Cuong", 8.5f, 9.5f);

		Student sv2 = new Student(2, "Huong", 9.0f, 9.0f);

		Student sv3 = new Student();
		System.out.println("Nhập mã sinh viên 3: ");
		sv3.setMaSV(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập tên sinh viên 3: ");
		sv3.setTenSV(sc.nextLine());
		System.out.println("Nhập điểm lý thuyết: ");
		sv3.setDiemTL(sc.nextFloat());
		System.out.println("Nhập điểm thực hành: ");
		sv3.setDiemTH(sc.nextFloat());
		System.out.printf("%6s %10s %20s %10s %10s \n", "Mã sinh viên", "Họ tên", "Điểm lý thuyết", "Điểm thực hành",
				"Điểm trung bình");
		sv1.inSV();
		sv2.inSV();
		sv3.inSV();
	}
}
