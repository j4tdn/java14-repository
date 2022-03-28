package Ex04;

public class Manager extends Personal {
	
	private int numberEmployee;
	
	public Manager(String fullName, String birthDay, float costSalary,int numberEmployee) {
		super(fullName,birthDay,costSalary);
		this.numberEmployee = numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		this.numberEmployee = numberEmployee;
	}
	
	public int getNumberEmployee() {
		return numberEmployee;
	}

	@Override
	public void calculationSalary() {
		this.setSalary((int)this.getCostSalary()*2200000); 
	}

	@Override
	public String toString() {
		return "Manager ["+super.toString()+"numberEmployee=" + numberEmployee + "]";
	}
	
	
	
	
}
