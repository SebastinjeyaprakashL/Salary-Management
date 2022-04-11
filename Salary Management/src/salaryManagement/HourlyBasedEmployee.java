package salaryManagement;

public class HourlyBasedEmployee extends Employee {
	
	private double workedHour;
	static final double hourlyRate = 50;
	
	public HourlyBasedEmployee (int employeeId, String name, double workedHour) {
		super(employeeId,name);
		this.workedHour = workedHour;
	}
	
	public double calculateSalary () {
		double salary = 0;
		double overTime = 0;
		
		if (workedHour > 270) {
			double extraHour = workedHour - 270;
			workedHour = 270;
			overTime = extraHour * (hourlyRate * 1.5);
		}
		salary = workedHour * hourlyRate;
		salary += overTime;
		return salary;
		
	}
	
	@Override
	public void getDetails() {
		System.out.println("Id : "+ this.getEmployeeId()+ " Name: " + this.getEmployeeName()+ " Salary : "+ this.calculateSalary());
	}
}
