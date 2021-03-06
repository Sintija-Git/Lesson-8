package Lesson8;
import java.util.Scanner;
/**
Develop an application that accepts 5 integers from the user and stores them in an array.
The application should then calculate and output the average number in the array.
Save the class as AverageApp.java
*/
public class AverageApp {

	public static void main(String[] args) {
		// declare an [] - array
		
		int numbers [] = new int [5];
		
		Scanner input = new Scanner (System.in);
		//input
		
		//for loop to prompt the user to input 5 times a num
		// each  interaction (or looping) of the loop will store the number provided by the user
		for (int i = 0; i < 5; i++) {
			System.out.println ("Enter number: ");
			numbers[i] = input.nextInt();
		}
		
		//process -> calculate the average of all the numbers from the array (5 in total as we know)
		double avg;
		int sum = 0;
		int counter = numbers.length; // n of elements in array
		
		//traverse the array to calculate the sum of all numbers provided by user
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i]; // in each loop adds the current element which is stored in array at index i to sum
			
		} //end for
		
		//to compute the average
		avg = (double) sum / counter;
		
		//output
		System.out.println ("Average number is: " + avg);
		
		//display the content for each [] array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println ("Number " + (i+1) + " is " + numbers[i]);
		}

		
	} //end main

} //end class
