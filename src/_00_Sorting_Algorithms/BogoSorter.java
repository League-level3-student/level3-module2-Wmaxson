package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	
	
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int i = 0;!intArraySorted(array); i++) {
			
		
			
		
			Random rand = new Random();			
			int int1 = rand.nextInt(array.length);
			int int2 = rand.nextInt(array.length);
			int int3 = array[int1];
			array[int1] = array[int2];
			array[int2] = int3;
			if (i%50000 == 0) {
				display.updateDisplay();
			}

		}
	}
	

	static boolean intArraySorted(int[] array){

		for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i-1]) {
					return false;
				} else {
				
				}
					
			}
		
		return true;
	}
	
	public static void swapArrayOfTwo(int[] arr) {
		 int[] arr1 = {0, 0};
		 arr1[0] = arr[1];
		 arr1[1] = arr[0];	
		 System.out.println();
	}
}
