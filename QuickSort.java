package com.george.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 15, 9, 7, 13, 12, 16, 4, 18, 11 };
		recurssionQuickSort(array, 0, array.length - 1);
		printArray(array);
	}

	public static int partition(int[] inputArray, int low, int high) { // used for partitioning small elements to left and large elements to right side of pivot
		int pivot = inputArray[(low + high) / 2];
		while (low <= high) {
			while (inputArray[low] < pivot) {
				low++;
			}

			while (inputArray[high] > pivot) {
				high--;
			}

			if (low <= high) {
				int temp = inputArray[low];
				inputArray[low] = inputArray[high];
				inputArray[high] = temp;
				low++;
				high--;
			}
		}
		return low; // returns pivot size only
	}

	public static void recurssionQuickSort(int[] inputArray, int low, int high) { // recursively calling the leftpart of pivot and right part of pivot
		int pi = partition(inputArray, low, high);
		if (low < pi - 1) {
			recurssionQuickSort(inputArray, low, pi - 1); // for leftpart
		}
		if (pi < high) {
			recurssionQuickSort(inputArray, pi, high); // for right part
		}
	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
