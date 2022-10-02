package prob05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 Bài 5 (20đ): Cho danh sách sinh viên được input từ file student.txt. Viết chương trình
1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần
theo họ tên.
2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
phân biệt với nhau thông qua MSSV
 */


public class App {
	private static final String path = "student.txt";
	public static void main(String[] args) throws Exception {
		List<Student> students = FileUtils.readLines(path, Student::new);

		List<Student> op1 = students.stream().sorted(Comparator.comparing(Student::getMediumScore).thenComparing(Student::getFullName))
				.collect(Collectors.toList());
		System.out.println("1. Sắp xếp danh sách sinh viên tăng dần theo DTB. Nếu DTB bằng nhau sắp xếp tăng\r\n"
				+ "dần theo họ tên.");
		op1.forEach(System.out::println);

		List<Student> op2 = students.stream().filter(student -> student.getMediumScore() > 8)
				.collect(Collectors.toList());
		System.out.println("2. Danh sách sinh viên có ĐTB > 8");
		op2.forEach(System.out::println);

		List<Student> op3 = students.stream().filter(student -> "Nu".equals(student.getGender()))
				.collect(Collectors.toList());
		System.out.println("3. Danh sách sinh viên NỮ");
		op3.forEach(System.out::println);

		System.out.println("4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được\r\n"
				+ "phân biệt với nhau thông qua MSSV");
		List<Student> op4 = students.stream()
				.collect(Collectors.groupingBy(student -> student, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());	
		op4.forEach(System.out::println);

	}
}
