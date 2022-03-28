package Ex01;

public class Student {
	private int mSSV;
	private String name;
	private float lT;
	private float tH;
	private float result;
	public Student() {
	}
	public Student(int mSSV, String name, float lT, float tH) {
		this.mSSV = mSSV;
		this.name = name;
		this.lT = lT;
		this.tH = tH;
	}
	public int getMSSV() {
		return mSSV;
	}
	public void setMSSV(int mSSV) {
		this.mSSV = mSSV;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getLT() {
		return lT;
	}
	public void setLT(float lT) {
		this.lT = lT;
	}
	public float getTH() {
		return tH;
	}
	public void setTH(float tH) {
		this.tH = tH;
	}
	
	public float getResult() {
		return result;
	}
	public void setResult() {
		
		this.result = (this.lT + this.tH)/2;
		if(this.result>8.5f) {
			System.out.println(this.name + ": Average > 8.5");
		}
	}
	@Override
	public String toString() {
		return "Student [MSSV=" + mSSV + ", Name=" + name + ", LT=" + lT + ", TH=" + tH + "]";
	}

}
