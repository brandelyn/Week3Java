package week3Java;

public class MethodsHomework {

	public static void main(String[] args) {

		// Write a method that takes a String, word, and an int, n, as arguments and
		// returns the word concatenated to itself n number of times. (i.e. if I pass in
		// “Hello” and 3, I would expect the method to return “HelloHelloHello”).

		// the method is on line 88
		String words = concatenateWords("Welcome", 4);
		System.out.println(words);

		// Write a method that takes two Strings, firstName and lastName, and returns
		// a full name (the full name should be the first and the last name as a String
		// separated by a space).

		// the method is on line 98
		String firstName = "Cosmo";
		String lastName = "Kramer";
		String fullName = createFullName(firstName, lastName);

		System.out.println(fullName);

		// Write a method that takes an array of int and returns true if the sum of all
		// the ints in the array is greater than 100.

		// the method is on line 102

		int[] numbers = { 4, 17, 35, 59, 10 };
		int max = 100;

		boolean isGreaterThan = greaterThan100(numbers, max);

		System.out.println(isGreaterThan);

		// Write a method that takes an array of double and returns the average of all
		// the elements in the array.

		// the method is on line 112

		double[] percent1 = { 2.0, 45.1, 13.0, 23.6 };
		double avg = average(percent1);

		System.out.println(avg);

		// Write a method that takes two arrays of double and returns true if the
		// average of the elements in the first array is greater than the average of the
		// elements in the second array.

		// the method is on line 122

		double[] percent2 = { 4.3, 21.3, 14.6, 37.8 };

		boolean isArray1Greater = avgTwoArrays(percent1, percent2);

		System.out.println(isArray1Greater);

		// Write a method called willBuyDrink that takes a boolean isHotOutside, and a
		// double moneyInPocket, and returns true if it is hot outside and if
		// moneyInPocket is greater than 10.50.

		// the method is on line 129

		boolean isHotOutside = true;
		double moneyInPocket = 14.50;

		boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);

		System.out.println(buyDrink);

		// Create a method of your own that solves a problem. In comments, write what
		// the method does and why you created it.
		
		//The method I created is, Write a method that takes an array of int and returns the sum of all the ints in the array.
		//I created this method because it made me create another array and a method that returns just a sum which wasn't in the homework.
		//the method is on line 133
		
		int[] nums = {34, 56, 7, 19, 23};
		
		int sum = sumOfNumbers(nums);
		System.out.println(sum);

	}


	public static String concatenateWords(String word, int numberOfTimes) {
		String words = "";
		while (numberOfTimes > 0) {
			words += word;
			numberOfTimes--;
		}
		return words;

	}

	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static boolean greaterThan100(int[] numbers, int max) {
		int total = 0;

		for (int number : numbers) {
			total += number;
		}

		return total > max;
	}

	public static double average(double[] percent1) {
		double sum = 0;
		for (int i = 0; i < percent1.length; i++) {
			sum += percent1[i];
		}

		return sum / percent1.length;

	}

	public static boolean avgTwoArrays(double[] percent1, double[] percent2) {
		double avg1 = average(percent1);
		double avg2 = average(percent2);

		return avg1 > avg2;
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPockets) {
		return isHotOutside && moneyInPockets > 10.50;
	}
	
	public static int sumOfNumbers(int[] nums) {
		int totalValue = 0;
		for (int i = 0; i < nums.length; i++) {
			totalValue += nums[i];
			
		}
		return totalValue;
	}
	
	

}
