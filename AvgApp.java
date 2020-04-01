package Lesson8;
import java.util.Scanner;

public class AvgApp {

	public static void main(String[] args) { 
		// declare [] to store int elements
		int numbers [];
		

		Scanner input = new Scanner (System.in); // input scanner
		System.out.println ("Enter the size of our array: ");
		int size = input.nextInt();
		numbers = new int [size];
		
		
	
		//input - loop to prompt the user to input the number
		//in each iteration of loop to store the num provided by the user in the numbers [] at the index i
		
		for (int i = 0; i < size; i++) {
			System.out.println ("Enter value "  + (i+1));
			numbers[i] = input.nextInt(); //here will be the size of array
		}
		 // processing
		
		AvgMax myMax = new AvgMax();
		myMax.setNumbers(numbers);// use the setter to store the numbers provided by the user
		myMax.computeMax();
//		myMax.calculateAvg();
		
		Avg myAvg = new Avg();
		myAvg.setNumbers(numbers);
		myAvg.calculateAvg();
		
		
		AvgMin myMin = new AvgMin();
		myMin.setNumbers(numbers);
		myMin.calculateMin();
		//get method to get data
		double a = myAvg.getAverage();
		System.out.println("The average of provided numbers is: " + a);
		
		int m = myMax.getMax();
		System.out.println("Max number provided is: " + m);
		
		double min = myMin.getMinumum();
		System.out.println("Min number provided is: " + min);
		
	} //end main

} //end class
