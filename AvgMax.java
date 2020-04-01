package Lesson8;
// average of all arrays 
public class AvgMax {
	//declare instance varibles
	
	private int numbers[];
	private int max;
	
	
	//default constructor , initialize variables with default values
	public AvgMax () {
		//numbers[] = 0;
		//average= 0.0;
		//max = 0;
		}
	//generate setter method
	
	public void setNumbers (int numbers[]) { //check here for how to make setter with arrays
		this.numbers = numbers;
	}
		
	//compute the max from all numbers
			public int computeMax() {
				max = numbers[0];
				for (int i = 0; i < numbers.length; i++) {
					
			//if the current element of [] located @ index i  > values stored in the max, we have to update the MAX with current higher element 
					if (numbers[i] > max) {
						//uppdate the max with current value
					max = numbers[i];
						
					} // end if
				} // end for
				
				return max;
				
			} //end compute max
				
				//geter for getting that max
				public int getMax () {
					return max;
					
	}

			

} //end class
