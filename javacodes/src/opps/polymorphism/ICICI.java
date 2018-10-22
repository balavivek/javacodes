package opps.polymorphism;

/**
 * OOPS concepts - Polymorphism Refer:
 * https://www.javatpoint.com/runtime-polymorphism-in-java
 * 
 * @author Vivek
 *
 */
public class ICICI extends Bank {

	@Override
	float getRateOfInterest() {
		float roi = 11.2f;
		return roi;
	}
}
