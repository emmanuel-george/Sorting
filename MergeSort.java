package com.george.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 15, 9, 7, 13, 12, 16, 4, 18, 11 };
		mergeSort(array);

		for(int i: array) {
			System.out.print(i+" ");
		}
		
	}

	private static void mergeSort(int[] array) {
		int inputLength = array.length;
		int midIndex = inputLength/2;
		if(inputLength < 2) {
			return;
		}
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];

		for(int i=0;i<midIndex;i++) {
			leftHalf[i] = array[i];
		}
		
		for(int i=midIndex;i<array.length;i++) {
			rightHalf[i-midIndex] = array[i];
		}
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(array, leftHalf, rightHalf);
		
	}

	private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
		int i=0, j=0, k=0;
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		while(i<leftSize && j< rightSize) {
			if(leftHalf[i]<=rightHalf[j]) {
				array[k] = leftHalf[i];
				i++;	
			} 
			
			else{
				array[k] = rightHalf[j];
				j++;	
			}
			
			k++;
		}
		
		while(i<leftSize) {
			array[k] = leftHalf[i];
			i++;
			k++;
		}
		while(j<rightSize) {
			array[k] = rightHalf[j];
			j++;
			k++;
		}
		
	}
	
	

}
