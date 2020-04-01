package Lesson8;

public class MultidimensionalArray { //actually 2 dim. array

	public static void main(String[] args) {
		// init 2 dim where 	// rows and columns
		
int [][] twoD = 	{{1, 2, 3}, {6, 7, 9, 2}, {9, 2, 4}};

//System.out.println (twoD [0][0]);

//int [][] twoDi = new int [3] [3]; 

// TO ACCSES WE USE FOR LOOP

 	for (int i = 0; i < twoD.length; i++ ) {
	for ( int j = 0; j < twoD [i].length; j++) {
		System.out.print (twoD[i][j] + " "); // i - outer loop, and j inner loop NOT WORKING - GOES INFINITY
	}
	
	System.out.println ();
	
	
	}
	} //end main

} //end class
