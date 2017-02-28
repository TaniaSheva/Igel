package com.demo;

public class BubbleSortingHomeWork {

	public static void main(String[] args) {
		int array [] = {12,1,4,6,16,22,15,23,45,90};
		sortArray(array);
		printArray(array);
		
		boolean contain = doesContainNumber(array, 4);
		System.out.println("Does array contain inserted value? " + contain);
	}
	
	//to find out if the array contains inserted number
	public static boolean doesContainNumber(int[] array, int toFindElement)
	{	
		int leftIndex = 0;
		int rightIndex = array.length - 1;
		
		while (leftIndex <= rightIndex) {
			
		int midIndex = leftIndex + (rightIndex - leftIndex)/2;
		int midElement = array[midIndex];
		if (toFindElement == midElement) {
			return true;
		}
		else if (toFindElement > midElement) {
			leftIndex = midIndex + 1;
		}
		else {
			rightIndex = midIndex - 1;
		}
		}
		return false;
	}
	
	//to sort array
	public static void sortArray(int[] array)
	{
		for (int indexTo = 0; indexTo < array.length - 1; indexTo++) {
			
			int indexFrom = indexTo;
			int temp = array[indexTo];
			for (int i = indexTo + 1; i < array.length; i++) {
				int current = array[i];
				if (current < temp) {
					temp = current;
					indexFrom = i;
				}
			}
			//switching elements
			int buffer = array[indexTo];
			array[indexTo] = array[indexFrom];
			array[indexFrom] = buffer;	
		}
	}

	public static void printArray(int[] array)
	{	System.out.println("Sorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
	}
}
