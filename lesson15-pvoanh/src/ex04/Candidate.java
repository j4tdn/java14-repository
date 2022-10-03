package ex04;

import java.util.List;
import java.util.function.Function;

public class Candidate {
	private int id;
	private int firstChoosen;
	private List<Integer> points;
	private int sumPoints;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int id, int firstChoosen, List<Integer> points) {
		super();
		this.id = id;
		this.firstChoosen = firstChoosen;
		this.points = points;
		this.sumPoints = points.stream().reduce(0,(a,b) ->a+b);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFirstChoosen() {
		return firstChoosen;
	}
	public void setFirstChoosen(int firstChoosen) {
		this.firstChoosen = firstChoosen;
	}
	public List<Integer> getPoints() {
		return points;
	}
	public void setPoints(List<Integer> points) {
		this.points = points;
	}
	public int getSumPoints() {
		return sumPoints;
	}
	public void setSumPoints(int sumPoints) {
		this.sumPoints = sumPoints;
	}
	
}
