package salaryManagement;

public class View {
	
	public static void displayEmployeeDetailsWithSalary (Employee employee) {
		employee.getDetails();
	}
	
	public static void main (String args []) {
		Employee confirmedEmployee = new ConfirmedEmployee(001, "ConfirmedEmployee");
		
		Employee incubationEmployee = new IncubationEmployee (002,"IncubationEmployee", 30);
		Employee hourlyEmployee = new HourlyBasedEmployee (003,"HourlyEmployee", 320);
		
		View.displayEmployeeDetailsWithSalary(confirmedEmployee);
		View.displayEmployeeDetailsWithSalary(incubationEmployee);
		View.displayEmployeeDetailsWithSalary(hourlyEmployee);
		
	}
}
