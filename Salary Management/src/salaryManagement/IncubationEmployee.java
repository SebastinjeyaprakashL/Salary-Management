package salaryManagement;

public class IncubationEmployee extends Employee {
	private double presentDays ;
	private static final double salaryPerDay = 500;
	
	public IncubationEmployee (int id, String name, double presentDays) {
		super (id, name);
		this.presentDays = presentDays;
	}
	
	public double getSalaryPerDay () {
		return IncubationEmployee.salaryPerDay;
	}
	
	public double getPresentDays () {
		return this.presentDays;
	}
	
	public void setPresentDays(double presentDays) {
		this.presentDays = presentDays;
	}
	
	public double calculateSalary () {
		double salary = 0;
		salary = IncubationEmployee.salaryPerDay * this.presentDays;
		return salary;		
	}

	@Override
	public void getDetails() {
		System.out.println("Id : "+ this.getEmployeeId()+ " Name: " + this.getEmployeeName()+ " Salary : "+ this.calculateSalary());
	}
}
