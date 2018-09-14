// This class needs to Return individual doubles from the array

package hw0911;

public class ArrayHandler {

	public Double[] currentDoubleArray;
	//Double doubleX;
	
	// Create a method that goes through each hard coded array of Doubles (one at a time)
	public ArrayHandler(Double[] doubleArrayNow) {	// constructor
		currentDoubleArray = doubleArrayNow;
	}
	
	public void PresentArrayCell() {
		
		for (int i = 0; i < currentDoubleArray.length; i++) {
			
			Double doubleX = currentDoubleArray[i];
			System.out.println("doubleX Is: " + doubleX + "\t(i) --> " + i);
			
			SinglyLinkedList<Double> singlyLinkedListDouble = new SinglyLinkedList<Double>();
			
			
			singlyLinkedListDouble.addFirst(doubleX);
			
			//singlyLinkedListDouble.addLast(doubleX);
			
			System.out.println("Size:" + singlyLinkedListDouble.size());
			System.out.println("Empty:" + singlyLinkedListDouble.isEmpty());
			//return doubleX;
		}
		//return null;
		System.out.println("######################################");
		
		
	}
	
}
