package ex05;

import static utils.Datamodel.*;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Student;

public class Ex05 {
	public static void main(String[] args) {
		File file = createFile("student.txt");
		List<String> fileString = readFile(file);
		List<Student> students = fileString.stream()
				.map(Student::toline)
				.collect(Collectors.toList());
		
			
		System.out.println("sap xep sinh vien tang dan");
		List<Student> studentSort = students.stream().
						sorted(Comparator.comparing(Student::getScore)
						.thenComparing(Comparator.comparing(Student::getfullname)))
						.collect(Collectors.toList());
		studentSort.forEach(System.out::println);
		
		System.out.println("danh sach sinh vien co DTB > 8");
		
		List<Student> studentDTB = students.stream()
											.filter(student -> student.getScore() > 8)
											.collect(Collectors.toList());
		studentDTB.forEach(System.out::println);
		
		System.out.println("tim kiem toan bo sinh vien la nu");
		students.stream()
		 .filter(t -> "Nu".equals(t.getGender()))
		 .forEach(System.out::println);
		
	}
	
}
