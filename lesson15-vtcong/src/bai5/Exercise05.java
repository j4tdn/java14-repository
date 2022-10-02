package bai5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise05 {
	public static void main(String[] args) throws IOException {
		File file = FileUtils.createNewFile("student.txt");
		List<String> lines = Files.readAllLines(file.toPath());
		
		List<Student> students = lines.stream().map(Student::new).collect(Collectors.toList()); 
		
		
		//1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần
		//theo họ tên.
		List<Student> studentSort = students.stream().sorted(Comparator.comparing(Student::getScore).thenComparing(Comparator.comparing(Student::getName))).collect(Collectors.toList());
		
		//2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		List<Student> studentFind1 = findStudent(students, student -> student.getScore() > 8);
		
		//3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		List<Student> studentFind2 = findStudent(students, student -> "Nữ".equals(student.getSex()));
		
		//4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
		//phân biệt với nhau thông qua MSSV
		List<String> code =  students.stream().map(Student::getId).collect(Collectors.toList());
		Map<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < code.size(); i++) {
			addElement(map, code.get(i));
		}
		for(String string :  map.keySet()) {
			if(map.get(string) == 1) {
				for (Student student : students) {
					if(string.equals(student.getId())) {
						System.out.println(student);
					}
				}
			}
			
		}


		
	}
	
	
	private static List<Student> findStudent(List<Student> students,Predicate<Student> predicate){
		List<Student> sastify = new ArrayList<>();
		for (Student student : students) {
			if(predicate.test(student)) {
				sastify.add(student);
			}
		}
		return sastify;
	}
	
	private static void addElement(Map<String, Integer> map, String element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}
}
