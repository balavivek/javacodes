package opps.polymorphism;

/**
 * OOPS concepts - Polymorphism Refer:
 * https://www.javatpoint.com/runtime-polymorphism-in-java
 * 
 * @author Vivek
 *
 */
public class HDFC extends Bank {
	@Override
	float getRateOfInterest() {
		float roi = 9.1f;
		return roi;
	}

}
