// This class needs to Return individual doubles from the array

package hw0911;

public class ArrayHandler {

	private Double[] currentDoubleArray;
	
	// Create a method that goes through each hard coded array of Doubles (one at a time)
	public ArrayHandler(Double[] doubleArrayNow) {	// constructor
		currentDoubleArray = doubleArrayNow;
	}
	
	public void PrintDoubleArrayContents() {
////------------------------ Array Double #1 -------------------------------------------------//
		System.out.println("  Cell\t\tIndex");
		
		for (int i = 0; i < currentDoubleArray.length; i++)
			
			System.out.println("- " + currentDoubleArray[i] + "\t ---   " + i);
		
		System.out.println("- - - - - - - - - - - -");
	
	}			
	
}
