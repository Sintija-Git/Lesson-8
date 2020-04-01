package Lesson8;
//transfer the average calculation from class AvgMax
public class Avg {
	private int numbers [];
	private double average;
	
	
	public Avg () {}
	
	public void setNumbers (int numbers[]) {
		this.numbers = numbers;
	}
	
	// compute method to compute the avg of all numbers in array
	public void calculateAvg () {
		int sum; // to store the sum of all the elements in it
		int currentElement; // to store the current element i from the array
		
		sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			// retrieve the element at index i
			sum = sum + numbers[i]; // this updates the sum by adding previous element to it 
			} //end for
		
		//compute
		average = (double) sum/numbers.length;  // have to cast for some reason
		
	}
	//getter for average
	public double getAverage () {
		return average;
		
		}
	
} //end class
