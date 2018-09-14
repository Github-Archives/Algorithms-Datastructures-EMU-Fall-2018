// This class needs to Return individual doubles from the array

package hw0911;

public class ArrayHandler {

	public Double[] currentDoubleArray;
	Double doubleX;
	SinglyLinkedList<Double> singlyLinkedListDouble;
	
	// Create a method that goes through each hard coded array of Doubles (one at a time)
	public ArrayHandler(Double[] doubleArrayNow) {	// constructor
		currentDoubleArray = doubleArrayNow;
	}
	
	public void PresentArrayCell() {
		
		for (int i = 0; i < currentDoubleArray.length; i++) {
			
			doubleX = currentDoubleArray[i];
			System.out.println("doubleX Is: " + doubleX + "\t(i) --> " + i);
			
//			SinglyLinkedList<Double> singlyLinkedListDouble = new SinglyLinkedList<Double>();
			singlyLinkedListDouble = new SinglyLinkedList<Double>();
			singlyLinkedListDouble.addFirst(doubleX);
			
			//System.out.println("[head] " + singlyLinkedListDouble.first());
			//System.out.println("[tail] " + singlyLinkedListDouble.last());
			//System.out.println("Size:" + singlyLinkedListDouble.size());
			//System.out.println("Empty:" + singlyLinkedListDouble.isEmpty());
		}
		System.out.println("\n######################################");	
	}
	
}
