package bt5;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Bai5 {
	public static void main(String[] args) {
		List<Student> students = DataModel.getStudents();
		
		//1. Sắp xếp sinh viên tăng dần theo �?TB. Nếu DTB bằng nhau sắp xếp tăng dần theo h�? tên.
		List<String> c1 = students.stream()
				.sorted(Comparator.comparing(Student::getScore))
				.map(Student::getName)
				.collect(Collectors.toList());
		c1.forEach(System.out::println);
		System.out.println("---");
		
		
		//2. Viết hàm tìm kiếm danh sách sinh viên có �?TB > 8
		List<String> c2 = students.stream()
				.filter(s -> s.getScore()>8)
				.map(Student::getName)
				.collect(Collectors.toList());
		c2.forEach(System.out::println);
		System.out.println("---");
		
		
		//3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		List<String> c3 = students.stream()
				.filter(s -> "Nu".equals(s.getGender()))
				.map(Student::getName)
				.collect(Collectors.toList());
		c3.forEach(System.out::println);
		System.out.println("---");
		
		
		//4. Tìm sinh viên xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV
		List<String> c4 = students.stream()
				.filter(PredicateUtils.distinctByKey(by -> by.getId()))
				.map(Student::getName)
				.collect(Collectors.toList());
		c4.forEach(System.out::println);
		System.out.println("---");
		
	}
}
