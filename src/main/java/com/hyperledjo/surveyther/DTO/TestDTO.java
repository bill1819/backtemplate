package com.hyperledjo.surveyther.DTO;

public class TestDTO {

	private String employee_id;
	private String first_name;
	private String salary;

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "TestDTO [employee_id=" + employee_id + ", first_name=" + first_name + ", salary=" + salary + "]";
	}

}
