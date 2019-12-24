package _00_Sorting_Algorithms;

public class QuickSorter extends Sorter {
	public QuickSorter() {
		type = "Quick";
	}
	
	//1. Since this sorting algorithm uses recursion, 
	//   we'll make a helper method called quickSort.
	//   Complete the steps in the quickSort method.
	//  You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		quickSort(array, 0, array.length-1, display);
		
	}
	
	private void quickSort(int[] array, int low, int high, SortingVisualizer display) {
       int i = low;
       int j = high;
       int pivot = array[(high+low)/2];
        while (i<=j) {
            while (array[i]<pivot) {
            	i++;
			}
            while (array[j]>pivot) {
            	j--;           	
			}
            if (i<=j) {				
            	int tempint = array[i];
				array[i]=array[j];
				array[j]=tempint;
            	i++;
            	j--;
			}            
        }
        if (low<j) {
        	quickSort(array, low, j, display);
		}
        if (i<high) {
			quickSort(array, i, high, display);
		}
        display.updateDisplay();
	}

}
