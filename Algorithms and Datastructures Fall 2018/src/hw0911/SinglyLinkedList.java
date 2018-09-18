//Drew Williams
//hw0911
//https://github.com/Drew-Williams/Algorithms-and-Datastructures-Fall-2018/blob/master/hw0906
//COSC 311


//https://stackoverflow.com/questions/4066729/creating-a-linkedlist-class-from-scratch/43735894?s=3|21.2192#43735894
package hw0911;

import java.util.Scanner;

public class SinglyLinkedList {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
    	
    	double currentDbl = 0.0;
    	double currentSum = 0.0;
    	double currentAvg = 0.0;
    	int tracker = 0;
    	
    	double[] array1 = new double[] {100.0};
    	double[] array2 = new double[] {10.0, 10.0, 100.0};
    	double[] array3 = new double[] {100.0, 10.0, 15.0, 20.0, 200.0, 30.0, 40.0, 300.0};
    	
    	SinglyLinkedListImpl listImpl = new SinglyLinkedListImpl();
    	
    	//First Array
    	for (int i = 0; i < array1.length; i++) {
    		currentDbl = array1[i];
    		
    		listImpl.insertAtEnd(currentDbl);	
    	}
    	System.out.println("Starting list:");
    	listImpl.disply();
    	 	
    	for (int i = 0; i < array1.length; i++) {
    		currentSum += array1[i];
    		tracker += 1;
    	}
    	
    	currentAvg = currentSum / tracker;
    	//System.out.println("Current Sum :" + currentSum);
    	System.out.println("\nAverage :" + currentAvg);
    	
    	for (int i = 0; i < array1.length; i++) {
    		currentDbl = array1[i];
    		if (currentDbl < currentAvg) {
    			listImpl.deleteNodeByGivenData(currentDbl);
    		}
    	}
    	System.out.println("\nEnding list:");
    	listImpl.disply();
    	
    	// Delete all nodes' data
    	for (int i = 0; i < array1.length; i++) {
    		currentDbl = array1[i];
			if (currentDbl > 0.0) {
				listImpl.deleteNodeByGivenData(currentDbl);
			}
    	}
		// Clear sum & avg
		currentSum = 0.0;
		currentAvg = 0.0;
		tracker = 0;
		
    	System.out.println("________________________________");

    	//Second array
    	for (int i = 0; i < array2.length; i++) {
    		currentDbl = array2[i];
    		
    		listImpl.insertAtEnd(currentDbl);	
    	}
    	System.out.println("Starting list:");
    	listImpl.disply();
    	
    	for (int i = 0; i < array2.length; i++) {
    		currentSum += array2[i];
    		tracker += 1;
    	}
    	
    	currentAvg = currentSum / tracker;
    	//System.out.println("Current Sum :" + currentSum);
    	System.out.println("Average :" + currentAvg);
    	
    	for (int i = 0; i < array2.length; i++) {
    		currentDbl = array2[i];
    		if (currentDbl < currentAvg) {
    			listImpl.deleteNodeByGivenData(currentDbl);
    		}
    	}
    	System.out.println("\nEnding list:");
    	listImpl.disply();
    	// Delete all nodes' data
		if (currentDbl > 0.0) {
			listImpl.deleteNodeByGivenData(currentDbl);
		}
		// Clear sum & avg
		currentSum = 0.0;
		currentAvg = 0.0;
		tracker = 0;
    	
    	System.out.println("________________________________");

    	//Third array
    	for (int i = 0; i < array3.length; i++) {
    		currentDbl = array3[i];	
    		listImpl.insertAtEnd(currentDbl);	
    	}
    	System.out.println("Starting list:");
    	listImpl.disply();
    	
    	for (int i = 0; i < array3.length; i++) {
    		currentSum += array3[i];
    		tracker += 1;
    	}
    	
    	currentAvg = currentSum / tracker;
    	//System.out.println("Current Sum :" + currentSum);
    	System.out.println("Average :" + currentAvg);
    	
    	for (int i = 0; i < array3.length; i++) {
    		currentDbl = array3[i];
    		if (currentDbl < currentAvg) {
    			listImpl.deleteNodeByGivenData(currentDbl);
    		}
    	}
    	System.out.println("\nEnding list:");
    	listImpl.disply();
    	// Delete all nodes' data
		if (currentDbl > 0.0) {
			listImpl.deleteNodeByGivenData(currentDbl);
		}
		// Clear sum & avg
		currentSum = 0.0;
		currentAvg = 0.0;
		tracker = 0;
  	
    	System.out.println("________________________________");
    }
}