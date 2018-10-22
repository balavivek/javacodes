package opps.polymorphism;

/**
 * OOPS concepts - Polymorphism Refer:
 * https://www.javatpoint.com/runtime-polymorphism-in-java
 * 
 * @author Vivek
 *
 */
public class TestPolymorphism {

	public static void main(String[] args) {
		Bank b;

		b = new SBI();
		System.out.println("SBI Rate of Interest : " + b.getRateOfInterest());

		b = new ICICI();
		System.out.println("ICICI Rate of Interest : " + b.getRateOfInterest());

		b = new HDFC();
		System.out.println("HDFC Rate of Interest : " + b.getRateOfInterest());
	}
}
