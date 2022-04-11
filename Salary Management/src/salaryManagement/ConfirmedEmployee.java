package salaryManagement;

public class ConfirmedEmployee extends Employee {

	public ConfirmedEmployee (int id, String name) {
		super (id, name);
	}
	
	@Override
	public void getDetails() {
		System.out.println("Id : "+ this.getEmployeeId()+ " Name: " + this.getEmployeeName()+ " Salary : "+ this.calculateSalaray());
	}
	
}
