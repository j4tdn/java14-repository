package ex01;

public class Student {
	private int idStudent ;
	private String nameStudent;
	private Graded graded ;
	
	
	public Student(int idStudent, String nameStudent, Graded graded) {
		super();
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.graded = graded;
	}


	public int getIdStudent() {
		return idStudent;
	}


	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}


	public String getNameStudent() {
		return nameStudent;
	}


	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}


	public Graded getGraded() {
		return graded;
	}


	public void setGraded(Graded graded) {
		this.graded = graded;
	}


	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", graded=" + graded + "]";
	}
	
	
	
}
