package salaryManagement;

public abstract class Employee {
	private int employeeId;
	private String employeeName;
	public static final double defaultSalaray = 50000;
	
	public Employee (int employeeId,String name) {
		this.employeeId = employeeId;
		this.employeeName = name;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public String getEmployeeName () {
		return this.employeeName;
	}
	
	public double calculateSalaray () {
		return defaultSalaray;
	}

	public abstract void getDetails();
}
