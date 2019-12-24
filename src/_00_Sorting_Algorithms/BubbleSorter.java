package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		while(!_00_SortedArrayChecker.intArraySorted(array)) {
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]>array[i+1]) {
				int[] arr1 = {array[i], array[i+1]};
				System.out.println(array[i]);
				System.out.println(array[i+1]);
				swapArrayOfTwo(arr1);
				array[i] = arr1[1];
				array[i+1] = arr1[0];
				System.out.println(array[i]);
				System.out.println(array[i+1]);
			}
		}
		display.updateDisplay();
		}								
	}
	
	public static void swapArrayOfTwo(int[] arr) {
		 int[] fortnite = {0, 0};
		 fortnite[0] = arr[1];
		 fortnite[1] = arr[0];	
		 System.out.println();
	}
	
	}
