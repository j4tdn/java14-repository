package bean;

import java.util.Objects;

public class Employee {
	private Integer id;
	private String name;
	private Integer salary;
	private Integer managerId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, Integer salary, Integer managerId) {
		super();
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
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getId());
	}
	@Override
	public boolean equals(Object o) {
		if(this == o ) return true;
		if(!(o instanceof Employee)) return false;
		
		Employee that = (Employee) o;
		
		return that.getId() == this.getId();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", managerId=" + managerId + "]";
	}
	

}
