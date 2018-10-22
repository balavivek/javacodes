package opps.encapsulation;

/**
 * OOPS concepts - Encapsulation Refer: https://www.javatpoint.com/encapsulation
 * https://www.geeksforgeeks.org/encapsulation-in-java/
 * https://beginnersbook.com/2013/05/encapsulation-in-java/
 * 
 * @author Vivek
 *
 */
public class TestEncapusulation {

	public static void main(String args[]) {

		Employee emp = new Employee();
		emp.setEmpID("E003");
		emp.setEmpName("vivek");
		emp.setEmpAge(25);
		emp.setEmpSalary(45000.00);

		System.out.println("ID : " + emp.getEmpID());
		System.out.println("name : " + emp.getEmpName());
		System.out.println("age : " + emp.getEmpAge());
		System.out.println("salary : " + emp.getEmpSalary());
	}
}
