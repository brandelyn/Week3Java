package week3Java;

public class Week3Homework {

	public static void main(String[] args) {

		// create an array of int called ages that contains the following values:
		// 3,9,23,64,2,8,28,93

		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 43 };

		// Programmatically subtract the value of the first element in the array from
		// the value in the last
		// element of the array (i.e. do not use ages[7] in your code). Print the result
		// to the console.

		System.out.println(ages[ages.length - 1] - ages[0]);

		// Add a new age to your array and repeat the step above to ensure it is dynamic
		// (works for arrays of different lengths).
		// I added 43 to my array and it still subtracted the first element and the last
		// element

		// Use a loop to iterate through the array and calculate the average age. Print
		// the result to the console.

		double sum = 0;
		for (int age : ages) {
			sum += age;
		}
		double average = sum / ages.length;
		System.out.println(average);

		// Create an array of String called names that contains the following values:
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// Use a loop to iterate through the array and calculate the average number of
		// letters per name. Print the result to the console.

		// Create a new array of int called nameLengths. Write a loop to iterate over
		// the previously created names array
		// and add the length of each name to the nameLengths array.

		int[] nameLengths = new int[names.length];

		for (int index = 0; index < names.length; index++) {
			String name = names[index];
			nameLengths[index] = name.length();

			System.out.println(name + ", " + nameLengths[index]);
		}

		// Write a loop to iterate over the nameLengths array and calculate the sum of
		// all the elements in the array. Print the result to the console.

		double totalLength = 0;

		for (int index = 0; index < nameLengths.length; index++) {
			totalLength += nameLengths[index];

		}
		System.out.println(totalLength);

		// Use a loop to iterate through the array and calculate the average number of
		// letters per name. Print the result to the console.

		double averageLetters = totalLength / nameLengths.length;
		System.out.println(averageLetters);

		// Use a loop to iterate through the array again and concatenate all the names
		// together, separated by spaces, and print the result to the console.

		for (String name : names) {
			System.out.print(name.concat(", "));
		}

		// How do you access the last element of any array?

		/*
		 * There is two ways you can access the last element of any array. First is
		 * print to console and insert either array[arr.length - 1] or array[5] but the
		 * first option is a better way as it can work if more gets added on without you
		 * having to change it.
		 */

		// How do you access the first element of any array?

		/*
		 * just use sysout and put in there (Array[0]) this will always work as the
		 * first element even if changed will be 0
		 */		
	}
	
		

}
