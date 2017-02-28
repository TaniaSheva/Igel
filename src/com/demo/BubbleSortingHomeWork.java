package com.demo;

public class BubbleSortingHomeWork {

	public static void main(String[] args) {
		int array [] = {12,1,4,6,16,22,15,23,45,90};
	
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
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	
	}

}
