package week4CodingProject;

import java.util.Arrays;

public class Week4CodingProject {

	public static void main(String[] args) {
		int [] ages = {3, 9, 23, 64, 2, 8, 28};
		//declare a new int array without telling it how many elements it would have in it
		int lengthArray = ages.length;
		//created int that will help define how many elements are in the array
		int mathematics = Math.abs(ages[lengthArray - lengthArray] - ages [lengthArray - 1]);
		//had to use absolute otherwise this would be a negative number
		System.out.println(mathematics);
		//printed the results of mathematics
		int []ages2 = {55, 22, 54, 65, 26, 25, 478, 24, 256};
		//created new array with 9 elements in it
		int lengthArray2 = ages2.length;
		//recreating int that will define how many elements are in the array
		int mathematics2 = Math.abs(ages2[lengthArray2 - lengthArray2]- ages2 [lengthArray2 - 1]);
		//recreating the subtraction from earlier
		System.out.println(mathematics2);
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// array named names
		int sum2 = 0;
		// declaring a variable to make a total amount
		for (int i = 0; i < names.length; i++) {
			//iterating through the loop
			sum2 += names[i].length();
			//making sum2 add all the amounts of name lengths together
		}
		int average2 = (sum2 / names.length);
		//making a new variable that will take the total amount of letters and divide it by the number of elements in the array
		String allTheNames = "";
		// creating a new String that will help concatenate
		for (int i = 0; i<names.length; i++) {
			// iterating through the loop 
			allTheNames += names[i] + " ";
			// making alltheNames add each name plus a space in between
		}
		System.out.println(allTheNames);
		//making it print allTheNames to the console
		System.out.println("I would use [arr.length] to access the last element in any array");
		System.out.println("I would use array[0] for whatever the first element in an array is");
		int []nameLengths = new int [names.length];
		//create a new array named nameLengths
		for (int i = 0; i < names.length; i++) {
			//iterate over the loop over the previously created names array
			nameLengths[i] = names[i].length();
			//add the length of each name to the namesLength array
		}
		int total = 0;
		//declare variable to calculate the sum of all the elements in the array
		for (int i = 0; i < nameLengths.length; i++) {
			total += nameLengths[i];
		}
	System.out.println(multiplyWord("Hello",3));
	System.out.println (fullName("Jennifer", "Underwood"));
	}
	private static String multiplyWord (String word, int n) {
		//created a method of String and int
		String multiplyWord = "";
		//created variable for the word to multiply
		for (int i = 0; i < n; i++);
		//iterate through the loop
		multiplyWord += word;
	return multiplyWord;
	//return phrase
	}
	private static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	private static Boolean greaterthan100 (int[] array) {
		return Arrays.stream(array).sum()>100;
	}
	private static double averageDoubleArray (double[] arr) {
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	private static Boolean firstArrayAverageBigger(double [] firstArr, double [] secondArr) {
		return averageDoubleArray(firstArr)>averageDoubleArray(secondArr);
	}
	private static Boolean willBuyDrink (Boolean isHotOutside, double moneyInPocket) {
		return isHotOutside;
	}
	private static int yearOfPossibleRetirement (int yearOfBirth) {
		return yearOfBirth + 65;
		//I know I'd like to know what year would be a good one to retire possibly
	}
}