package kosa.hrmSystem.employees;

public class HrStaff extends Employee {
	private String name, employeeId, employeePw;

	public HrStaff() {
	}

	public HrStaff(String name, String employeeId, String employeePw) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.employeePw = employeePw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeePw() {
		return employeePw;
	}

	public void setEmployeePw(String employeePw) {
		this.employeePw = employeePw;
	}

}
