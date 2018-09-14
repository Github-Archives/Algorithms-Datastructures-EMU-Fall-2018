package hw0911;
// Data Structures and Algorithms in Java Sixth Edition Goodrich, Tamassia, Goldwasser.
// pg. 126-127

public class SinglyLinkedList <E> {//official book page @page #126
	
	////----------Creates the Nodes------------------------------
	//----------- nested Node class ----------------------------
	private static class Node<E> {
		
		private E element;	// reference to "element" stored at this Node
		private Node<E> next; // reference to the "next" Node in the List
		
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	}//------ end of nested Node class --------
	//----------------------------------------
	
	// Instance variables of the SinglyLinkedList
	private Node<E> head = null;	// head node of the list (or null if empty)
	private Node<E> tail = null;	// last node of the list (or null if empty)
	private int size = 0;			// number of nodes in the list
	
	public SinglyLinkedList() { 
		// constructs an initially empty list
	}		

	// ACCESS METHODS
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public E first() {				// returns (but does not remove) the first element
		if (isEmpty()) {
			return null;
		}
		return head.getElement();
	}
	public E last() {				// returns (but does not remove) the last element
		if (isEmpty()) {
			return null;
		}
		return tail.getElement();
	}
	
	// UPDATE METHODS
	public void addFirst(E e) {		// adds element 'e' to the front of the list
		head = new Node<>(e, head);	// create and link a new node
		if (size == 0) {
			tail = head;			// special case: new node becomes tail also 
		}
		size++;							
	}
	public void addLast(E e) {		// adds element 'e' to the end of the list
		Node<E> newest = new Node<>(e, null);	// node will eventually be the tail
		if (isEmpty()) {
			head = newest;			// special case: previously empty list
		}else {
			tail.setNext(newest);	// new node after existing tail
		}
		tail = newest;				// new node becomes the tail
		size++;
	}
	public E removeFirst() {		// removes and returns the first element
		if (isEmpty()) {
			return null;			// nothing to return
		}
		E answer = head.getElement();
		head = head.getNext();		// will become null if list had only one node
		size--;
		if (size == 0) {
			tail = null;			// special case as list is now empty
		}
		return answer;		
	}
	
////************************************************************************************************	
//	public static void main(String[] args) {//** working very good!
//		
//		Double doubleX = 0.0;
//
//////******Now we grab a Double Array and fill each Node with the values within the Double array.
//		// created the 3 hard coded Double Arrays for the 3 different trials
//		Double[] dblHardCoded1 = new Double[]{100.0};
//		Double[] dblHardCoded2 = new Double[]{10.0, 100.0, 10.0};
//		Double[] dblHardCoded3 = new Double[]{100.0, 10.0, 15.0, 20.0, 200.0, 30.0, 40.0, 300.0};
//
//		SinglyLinkedList<Double> singlyLinkedListDouble = new SinglyLinkedList<Double>();
//		
//		
//		
//		
//		// doubleX needs to be current array cell Double value
//		
//		singlyLinkedListDouble.addFirst(doubleX);
//		
//		
//		
//// WHAT WE NEED TO DO NOW IS TO LOOP THROUGH THE DOUBLE ARRAYS
//	// Take the current Double value at the current index and do this with it.
//		ArrayHandler arrHandler1 = new ArrayHandler(dblHardCoded1);
//		arrHandler1.PrintDoubleArrayContents();
//		
//		ArrayHandler arrHandler2 = new ArrayHandler(dblHardCoded2);
//		arrHandler2.PrintDoubleArrayContents();
//			
//		ArrayHandler arrHandler3 = new ArrayHandler(dblHardCoded3);
//		arrHandler3.PrintDoubleArrayContents();
//		
//		
//		
//		
//	}	// end of main
	
	
}	// end of SinglyLinkedList


