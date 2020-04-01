package Lesson8;

public class AvgMin {
	//declare instance variable
private int numbers [];
private double minimum; 


public AvgMin () {
}

//setter
public void setNumbers(int[] numbers) {
	this.numbers = numbers;
}

//getter
public double getMinumum() {
	return minimum;
}

public void calculateMin () {
	//init the minimum with the first element of the array
	minimum = numbers [0];
	//traverse the array of the 2nd element [1] since we stored the 1st one in the variable minimum
	for (int i = 1; i < numbers.length; i++) {
		// if the current element loc in the array numbers at index  i is lower than the value stored in the minimum, then update min with current lowest el.
		if (numbers[i] <minimum) {
		minimum = numbers [i]; //this update is being made here
		
		}}
	
}

} //end class
