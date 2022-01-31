package com.george.sorting;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {-22,-15,1,7,20,35,55};
		System.out.println(recursiveBinary(array, 0, array.length,35));

	}

	private static int recursiveBinary(int[] array, int start, int end, int value) {
		if(start >= end) {
			return -1;
		}
		
		int mid = (start+end)/2;
		if(array[mid] == value) {
			return mid;
		} else if(array[mid] < value) {
			start = mid+1;
			return recursiveBinary(array, start, end, value);
		} else {
			end = mid;
			return recursiveBinary(array, start, end, value);
		}
	}

}
