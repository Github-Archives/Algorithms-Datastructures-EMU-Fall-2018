//Drew Williams
//hw0911
//https://github.com/Drew-Williams/Algorithms-and-Datastructures-Fall-2018/blob/master/hw0911.java
//COSC 311
// READ THIS??
// FUCK YOU CAN YOU READ THISSSSS THOUGH???

package hw0911;

public class SinglyLinkedList {
	
	public static void main(String[] args) {
		
//		Write Java functions that will
//		
//		 [1]. Create a singly linked list of dynamically allocated nodes from a hardcoded array of doubles.
//		 Note: A forward traversal of the linked list must give the data in the same 
//		 order as a forward traversal of the hardcoded input array.
		
		//https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
		// prints out every single STRING in the arguments
         for (String s: args) {
            System.out.println(s);
		 }
		
		// makes sure we loop through only thrice
		int cycle = 1;		
		do {
			System.out.println("cycle #" + cycle);
			
			double[] hardCodedDoubles = new double[cycle];
				
			cycle += 1;			
		}
		while(cycle <= 3);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// http://theopentutorials.com/tutorials/java/cmd-line-args/how-to-pass-command-line-arguments-in-eclipse-ide/
		//
		//	// Right click -> Run As -> Run Configuration -> Arguments -> Program Assignments --> Enter values, seperated by spaces..
		//  //   These will be read in as "STRINGS" no matter what they actually are. So we'll have to convert them if we need something else.
		//
		// --(A) Screen shot showing program execution on the input array.
		// 			100.0
		//
		// --(B) Screen shot showing program execution on the input array.
		// 			10.0 100.0 10.0
		//
		// --(C) Screen shot showing program execution on the input array.
		// 			100.0 10.0 15.0 20.0 200.0 30.0 40.0 300.0
		//
		/////////////////////////////////////////////////////////////////
		
		// Assign all values using Eclipse Command-line arguments at runtime
		double a, b, c, d, e, f, g, h, i, j, k, l;
		a = Double.parseDouble(args[0]);  		// 100.0
			System.out.println("a: " + a + "\n");
		
			
		b = Double.parseDouble(args[1]);  		// 10.0
			System.out.println("b: " + b);			//
		c = Double.parseDouble(args[2]);  		// 100.0
			System.out.println("c: " + c);			//
		d = Double.parseDouble(args[3]);  		// 10.0
			System.out.println("d: " + d + "\n");
		
			
		e = Double.parseDouble(args[4]);  		// 100.0
			System.out.println("e: " + e);			//
		f = Double.parseDouble(args[5]);  		// 10.0
			System.out.println("f: " + f);			//
		g = Double.parseDouble(args[6]);  		// 15.0
			System.out.println("g: " + g);			//
		h = Double.parseDouble(args[7]);  		// 20.0
			System.out.println("h: " + h);			//
		i = Double.parseDouble(args[8]);  		// 200.0
			System.out.println("i: " + i);			//
		j = Double.parseDouble(args[9]);  		// 30.0
			System.out.println("j: " + j);			//
		k = Double.parseDouble(args[10]); 		// 40.0
			System.out.println("k: " + k);			//
		l = Double.parseDouble(args[11]); 		// 300.0
			System.out.println("l: " + l + "\n");	
		
		
/////////////////////////////////////////////////////////////////////////////////		
//		100.0 
//		10.0 100.0 10.0 
//		100.0 10.0 15.0 20.0 200.0 30.0 40.0 300.0 
///////////////////////////////////////////////////////////////////////////////		
//		
//		Starting list:   100.0  10.0  15.0  20.0  200.0  30.0  40.0  300.0
//		Average: 89.375
//		Ending list:     10.0  15.0  20.0  30.0  40.0 
//
//////////////////////////////////////////////////////////////////////////
		
		
	} // end of main method
	
} // end of entire class SinglyLinkedList

		/////////////////////////////////////////////////////////////////////////////////////////
		//
		// (1). Singly Linked List of int values (I need to build the Linked List from scratch).
		// (2). Step thru Linked List.
		// (3). Compute the Average of all Linked List Values.
		// (4). Step thru Linked List again and DELETE All Values that fall below the computed average.
		// 						  :	(extras) :
		//			-Cannot copy array Linked List data to a new array?
		//			-The smaller the scope of the variable, the shorter the name
		//			-Don't add Linked List data from user input.
		//			-	Instead we should be hardcoding the values into the original array (we can also use runtime arguments if we prefer)
		//
	    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		#COSC 311 Homework 9/11/2018#   
//
//		##Singly linked list, create, traverse, delete nodes.##
//
//		Distributed: T 9/11/2018       Due: T 9/18/2018
//
//		Write Java functions that will
		
//		 [1]. Create a singly linked list of dynamically allocated nodes from a hardcoded array of doubles.
//		 Note: A forward traversal of the linked list must give the data in the same 
//		 order as a forward traversal of the hardcoded input array.
//		 
//		 [2]. Compute the average of the values from the linked list by stepping
//		 through the list using forward traversal.
//		 Do not compute the average while creating the linked list in (1).
//		 
//		 [3]. Modify the linked list *in place* by deleting all elements that are less than the
//		 average computed in (2) above.
//		 The modification of the linked list must be done on the original list -- do not
//		 create a second list from the "accepted" values of the linked list created in (1).
//		 
//		 [4]. Output the linked list.
//		 
//		Demonstrate your Java functions work correctly be executing the following steps:
//		  {1}. Create linked list from hardcoded array of doubles.
//		  
//		  {2}. Output linked list values (forward traversal).
//		  
//		  {3}. Compute average, then output average.
//		  
//		  {4}. Delete elements that are greater than average using forward traversal, 
//		  destructive, in-place deletion of nodes.
//		  
//		  {5}. Output linked list values.
//		  
//		Outputs must include text to label the output. E.g.,
//
//		Starting list:   100.0  10.0  15.0  20.0  200.0  30.0  40.0  300.0
//
//		Average: 89.375
//
//		Ending list:     10.0  15.0  20.0  30.0  40.0 
//
//
//		Constraints:
//		(1) You must code up your own Node class and LinkedList class -- you can use
//		  or cannibalize code provided by textbooks, Web, instructor, etc. If you use
//		  or cannibalize code, cite the source (giving URL, text title, etc) in the
//		  header of your source code. I may look at the original code, so give sufficient
//		  information for me to be able to find it.
//
//		(2) Do not use ArrayList, List, Queue, etc.
//
//		(3) Traversals of the linked list and the hardcoded input array are forward.
//
//		 
//		Points taken off for:
//		(1) Doesn't work
//		(2) Failure to meet style constraints
//		(3) Failure to meet coding constraints
//		(4) Code does not match output
//		(5) Ugly or difficult to understand code
//
//		Turn in:
//		  -- Hard copy of code
//		  -- Header must include your last name, homework identifier (hw0911), URL
//		     of source code.
//		  -- Screen shot showing program execution on the input array
//		  { 100.0 }
//		  -- Screen shot showing program execution on the input array
//		  { 10.0, 100.0, 10.0}
//		  -- Screen shot showing program execution on the input array
//		  { 100.0,  10.0,  15.0,  20.0,  200.0,  30.0,  40.0,  300.0 }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
