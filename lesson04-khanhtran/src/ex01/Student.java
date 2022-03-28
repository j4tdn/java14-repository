package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private float theoreticalPoint;
    private float practicePoint;
    
    private Scanner ip = new Scanner(System.in);
    
    public Student() {
	}

	public Student(String id, String name, float theoreticalPoint, float practicePoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
    public float getAverageScore() {
    	return (theoreticalPoint + practicePoint)/2;
    }
    public void setAttribute() {
    	System.out.println("Nhap thuoc tinh cua sinh vien:");
    	System.out.println("Nhap ma sinh vien:");
    	this.setId(ip.nextLine());
    	System.out.println("Nhap ten sinh vien:");
    	this.setName(ip.nextLine());
    	System.out.println("Nhap diem ly thuyet:");
    	this.setTheoreticalPoint(Float.parseFloat(ip.nextLine()));
    	System.out.println("Nhap diem thuc hanh:");
    	this.setPracticePoint(Float.parseFloat(ip.nextLine()));
    }
    public static Student[] getStudent(Student[] students, float x) {
    	Student[] result = new Student[students.length];
    	int run = 0;
    	for(Student student : students) {
    		if(student.getAverageScore() > x) {
    			result[run++] = student;
    		}
    	}
    	return Arrays.copyOfRange(result, 0, run);
    }
    public static Student[] getStudent2(Student[] students) {
    	Student[] result = new Student[students.length];
    	int run = 0;
    	for(Student student : students) {
    		if(student.getTheoreticalPoint() > student.getPracticePoint()) {
    			result[run++] = student;
    		}
    	}
    	return Arrays.copyOfRange(result, 0, run);
    }
    @Override
    public String toString() {
    	return id + " " + name + " " + theoreticalPoint + " " + practicePoint;
    }
}
