package opps.polymorphism;

/**
 * OOPS concepts - Polymorphism Refer:
 * https://www.javatpoint.com/runtime-polymorphism-in-java
 * 
 * @author Vivek
 *
 */
public class SBI extends Bank {

	@Override
	float getRateOfInterest() {
		float roi = 10.2f;
		return roi;
	}
}
