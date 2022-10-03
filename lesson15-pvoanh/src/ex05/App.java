package ex05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(new File("student.txt"));
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		List<Student> students = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(", ");
			if (arr.length == 4) {
				students.add(new Student(arr[0], arr[1], Double.parseDouble(arr[2]), arr[3]));
			}
		}
		/**
		 * 1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp
		 * tăng dần theo họ tên.
		 */
		sortByPoint(students);
		students.forEach(System.out::println);
		System.out.println("=================================");
		/**
		 * 2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		 */
		getPointGreaterThan8(students).forEach(System.out::println);
		System.out.println("=================================");
		/**
		 * 3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		 */
		getGenderIsFeMale(students).forEach(System.out::println);
		System.out.println("======================");
		getDistinct(students).forEach(System.out::println);
	}

	private static void sortByPoint(List<Student> students) {
		students.sort(Comparator.comparing(Student::getPoint).thenComparing(Comparator.comparing(Student::getName)));
	}
	
	private static List<Student> getPointGreaterThan8(List<Student> students){
		return students.stream().filter(s -> s.getPoint() > 8).collect(Collectors.toList());
	}
	private static List<Student> getGenderIsFeMale(List<Student> students){
		return students.stream().filter(s -> s.getGender().equals("Nu")).collect(Collectors.toList());
	}
	private static Set<Student> getDistinct(List<Student> students){
		return new HashSet(students);
	}
}
