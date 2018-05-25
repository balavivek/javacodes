package basic;

public class FindLargestSmallestNumber {

	public static void main(String[] args) {

		int numbers[] = new int[] { 55, 66, 44, 88, 99, 112, 2252, 55, 2, 1, 6, 12, 569, 999, 3, 9, 1 };

		int smallest = numbers[0];
		int lagerst = numbers[1];

		for (int i = 1; i < numbers.length; i++) {

			if (lagerst < numbers[i]) {
				lagerst = numbers[i];
			} else if (smallest > numbers[i]) {
				smallest = numbers[i];
			}

		}

		System.out.println("Smallest : " + smallest + " lagerst : " + lagerst);
	}

}
