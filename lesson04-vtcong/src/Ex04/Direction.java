package Ex04;

public class Direction extends Personal {

	private float costPosition ;
		
	public Direction(String fullName, String birthDay, float costSalary,float costPosition) {
		super(fullName,birthDay,costPosition);
		this.costPosition = costPosition;
	}

	public float getCostPosition() {
		return costPosition;
	}

	public void setCostPosition(float costPosition) {
		this.costPosition = costPosition;
	}

	@Override
	public void calculationSalary() {
		this.setSalary((int)(this.costPosition+this.getCostSalary())*3000000);
	}

	@Override
	public String toString() {
		return "Direction ["+super.toString()+"costPosition=" + costPosition + "]";
	}
	
	
	
}
