package com.practicealgorithm.sorting;

public class QuickSort {
	private static void swapVariables(int[] arr, int i, int j) {
		int swap = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = swap;
	}
	public static void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);
	 
	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
	 
	 private static int partition(int arr[], int begin, int end) {
		    int pivot = arr[end];
		    int i = (begin-1);
		 
		    for (int j = begin; j < end; j++) {
		        if (arr[j] <= pivot) {
		            i++;
		 
		            swapVariables(arr, i,j);
		        }
		    }
		    swapVariables(arr, i+1, end);
		 
		    return i+1;
		}
	public static void main(String[] args) {
		int[] array= new int[] {4,2,7,2,5,8,9,2,6,4,7};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		quickSort(array, 0, array.length-1);

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
