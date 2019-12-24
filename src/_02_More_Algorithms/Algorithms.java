package _02_More_Algorithms;

import java.util.List;
import java.util.Random;

import _00_Sorting_Algorithms.SortingVisualizer;
import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 1; i < eggs.size(); i++) {

			if (eggs.get(i).equals("cracked")) {
				
				return i;
			}
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int a = 0;
		for (int i = 1; i < oysters.size(); i++) {

			
			if (oysters.get(i) == true) {
				
				a++;
				
			}
			
		}
		return a;
	}
	
	public static Double findTallest(List<Double> people) {
		int currentTallest = 0;
		for (int i = 1; i < people.size(); i++) {

			
			if (people.get(i) > people.get(currentTallest) ) {
				
				currentTallest = i;
				
			}
			
		}
		return people.get(currentTallest);
	}
	


public static String findLongestWord(List<String> Words) {
	int currentTallest = 0;
	for (int i = 1; i < Words.size(); i++) {

		
		if (Words.get(i).length() > Words.get(currentTallest).length() ) {
			
			currentTallest = i;
			
		}
		
	}
	return Words.get(currentTallest);
}

public static Boolean containsSOS(List<String> Words) {
	for (int i = 1; i < Words.size(); i++) {

		
		if (Words.get(i).contains("... --- ...")) {
			
			return true;
			
		}
		
	}
	return false;
}
public static List<Double> sortScores(List<Double> Scores) {
	List<Double> scores = Scores;
	while(!doubleArraySorted(scores)) {
		for (int i = 0; i < scores.size()-1; i++) {
			if (scores.get(i)>scores.get(i+1)) {
				Double[] arr1 = {scores.get(i), scores.get(i+1)};
				System.out.println(scores.get(i));
				System.out.println(scores.get(i+1));
				swapArrayOfTwo(arr1);
				scores.set(i, arr1[1]);
				scores.set(i+1, arr1[0]);
			}
		}
	}
	return scores;
}


public static List<String> sortDNA(List<String> Scores) {
	List<String> scores = Scores;
	while(!stringArraySorted(scores)) {
		for (int i = 0; i < scores.size()-1; i++) {
			if (scores.get(i).length()>scores.get(i+1).length()) {
				String[] arr1 = {scores.get(i), scores.get(i+1)};
				System.out.println(scores.get(i));
				System.out.println(scores.get(i+1));
				swapArrayOfTwo(arr1);
				scores.set(i, arr1[1]);
				scores.set(i+1, arr1[0]);
			}
		}
	}
	return scores;
}

static boolean doubleArraySorted(List <Double> array){

	for (int i = 1; i < array.size(); i++) {
			if (array.get(i) < array.get(i-1)) {
				return false;
			} else {
			
			}
				
		}
	
	return true;
}

static boolean stringArraySorted(List <String> array){

	for (int i = 1; i < array.size(); i++) {
			if (array.get(i).length() < array.get(i-1).length()) {
				return false;
			} else {
			
			}
				
		}
	
	return true;
}

public static List<String> sortWords(List<String> words){
	for (int i = 0; i > words.size(); i++) {
		if (words.get(i).compareTo(words.get(i+1)) > 0) {
			int tempWord = words.get(i);
		}
	}
	return words;
}

public static void swapArrayOfTwo(Double[] arr) {
	 double[] fortnite = {0, 0};
	 fortnite[0] = arr[1];
	 fortnite[1] = arr[0];	
}

public static void swapArrayOfTwo(String[] arr) {
	 String[] fortnite = {"", ""};
	 fortnite[0] = arr[1];
	 fortnite[1] = arr[0];	
}

}


