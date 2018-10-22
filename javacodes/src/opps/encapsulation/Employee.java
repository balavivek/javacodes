package opps.encapsulation;

/**
 * OOPS concepts - Encapsulation Refer: https://www.javatpoint.com/encapsulation
 * https://www.geeksforgeeks.org/encapsulation-in-java/
 * https://beginnersbook.com/2013/05/encapsulation-in-java/
 * 
 * @author Vivek
 *
 */
public class Employee {

	private String empID;
	private String empName;
	private int empAge;
	private double empSalary;

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
