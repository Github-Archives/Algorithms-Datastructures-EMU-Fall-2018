package hw0911;

public class Main {

	//************************************************************************************************	
		public static void main(String[] args) {//** working very good!
			
			//Double doubleX = 0.0;
			int tracker = 0;

	////******Now we grab a Double Array and fill each Node with the values within the Double array.
			// created the 3 hard coded Double Arrays for the 3 different trials
			Double[] dblHardCoded1 = new Double[]{100.0};
			Double[] dblHardCoded2 = new Double[]{10.0, 100.0, 10.0};
			Double[] dblHardCoded3 = new Double[]{100.0, 10.0, 15.0, 20.0, 200.0, 30.0, 40.0, 300.0};

//			SinglyLinkedList<Double> singlyLinkedListDouble = new SinglyLinkedList<Double>();
//			singlyLinkedListDouble.addFirst(doubleX);


			ArrayHandler arrHandler3 = new ArrayHandler(dblHardCoded3);
			arrHandler3.PresentArrayCell();
			//Double doubleX = arrHandler3.PresentArrayCell();
			//System.out.println(doubleX + "\t\t_DoubleX");
			//System.out.println("- - - - - - - - - - -");
						
			System.out.println(dblHardCoded3);
			
			
			
			
			
//				ArrayHandler arrHandler1 = new ArrayHandler(dblHardCoded1);
//				arrHandler1.PresentArrayCell();
//				System.out.println("- - - - - - - - - - -");
//				
//				ArrayHandler arrHandler2 = new ArrayHandler(dblHardCoded2);
//				arrHandler2.PresentArrayCell();
//				System.out.println("- - - - - - - - - - -");
				
//				ArrayHandler arrHandler3 = new ArrayHandler(dblHardCoded3);
//				arrHandler3.PresentArrayCell();
//				System.out.println("- - - - - - - - - - -");

			
			// This is just printing out all the cell values at once in it's method.
			//  What we need is for it to return a single cell for me to call
			//	singlyLinkedListDouble.addFirst(doubleX);

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
