package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] poopoopeepee = {"PooPoo", "PeePee"};
		_00_LinearSearch l = new _00_LinearSearch();
		assertEquals(l.linearSearch(poopoopeepee, "PooPoo"), 0);
		assertEquals(l.linearSearch(poopoopeepee, "PeePee"), 1);
		assertEquals(l.linearSearch(poopoopeepee, "Vommit"), -1);
	}
	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] poopoopeepee = {1, 0};
		assertEquals(_01_BinarySearch.binarySearch(poopoopeepee, 0, poopoopeepee.length-1, 1), 0);
		assertEquals(_01_BinarySearch.binarySearch(poopoopeepee, 0, poopoopeepee.length-1, 0), 1);
		assertEquals(_01_BinarySearch.binarySearch(poopoopeepee, 0, poopoopeepee.length-1, 3), -1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] poopoopeepee = {10, 20, 30, 40, 50};
//		assertEquals(_02_InterpolationSearch.interpolationSearch(poopoopeepee, 10), 0);
//		assertEquals(_02_InterpolationSearch.interpolationSearch(poopoopeepee, 30), 2);
//		assertEquals(_02_InterpolationSearch.interpolationSearch(poopoopeepee, 105), -1);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] poopoopeepee = {10, 20, 30, 40, 50};
		assertEquals(_03_ExponentialSearch.exponentialSearch(poopoopeepee, 10), 0);
		assertEquals(_03_ExponentialSearch.exponentialSearch(poopoopeepee, 30), -1);
		assertEquals(_03_ExponentialSearch.exponentialSearch(poopoopeepee, 105), -1);
	}
}







