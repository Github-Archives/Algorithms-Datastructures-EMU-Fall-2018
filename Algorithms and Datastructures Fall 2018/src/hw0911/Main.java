package hw0911;

public class Main {

	//************************************************************************************************	
		public static void main(String[] args) {//** working very good!
			
			Double doubleX = 0.0;

	////******Now we grab a Double Array and fill each Node with the values within the Double array.
			// created the 3 hard coded Double Arrays for the 3 different trials
			Double[] dblHardCoded1 = new Double[]{100.0};
			Double[] dblHardCoded2 = new Double[]{10.0, 100.0, 10.0};
			Double[] dblHardCoded3 = new Double[]{100.0, 10.0, 15.0, 20.0, 200.0, 30.0, 40.0, 300.0};

			SinglyLinkedList<Double> singlyLinkedListDouble = new SinglyLinkedList<Double>();
			

			// doubleX needs to be current array cell Double value
			singlyLinkedListDouble.addFirst(doubleX);
			
			
			
	// WHAT WE NEED TO DO NOW IS TO LOOP THROUGH THE DOUBLE ARRAYS
		// Take the current Double value at the current index and do this with it.
			ArrayHandler arrHandler1 = new ArrayHandler(dblHardCoded1);
			arrHandler1.PrintDoubleArrayContents();
			
			ArrayHandler arrHandler2 = new ArrayHandler(dblHardCoded2);
			arrHandler2.PrintDoubleArrayContents();
				
			ArrayHandler arrHandler3 = new ArrayHandler(dblHardCoded3);
			arrHandler3.PrintDoubleArrayContents();
			
			
			
			
		}	// end of main
}


//We use this generic framework <E> because we don't want to have
//to write in stone what type of data will be in each Node.

//SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
//System.out.println("sll size:" + sll.isEmpty());
//System.out.println("sll size:" + sll.size());
//sll.addFirst(69);
//System.out.println("sll size:" + sll.isEmpty());
//System.out.println("sll size:" + sll.size());
//System.out.println("sll First(Head):" + sll.first());	
