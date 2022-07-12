package bean;

import java.util.Objects;

public class Employee {
	private Integer id;
	private String name;
	private Integer salary;
	private Integer managerId;

	public Employee() {

	}

	public Employee(Integer id, String name, Integer salary, Integer managerId) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.managerId = managerId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	
	// 2 đối tượng mà equals thì hash code phải bằng nhau
	
	// số lượng thuộc tính ở equals

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Employee)) {
			return false;

		}
		Employee that = (Employee) o;

		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", managerId=" + managerId + "]";
	}

}
