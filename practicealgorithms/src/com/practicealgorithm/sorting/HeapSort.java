package com.practicealgorithm.sorting;

public class HeapSort {

	private static void swapVariables(int[] arr, int i, int j) {
		int swap = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = swap;
	}
	static void maxHeapify(int arr[], int n, int i) 
    { 
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
  
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        if (largest != i) 
        { 
        	swapVariables(arr, i, largest);
        	maxHeapify(arr, n, largest); 
        } 
    }

	private static int[] heapSort(int[] array) {
		int n = array.length; 
	  	for (int i = n / 2 - 1; i >= 0; i--) 
	  		maxHeapify(array, n, i); 
	  	        
	  	for (int i=n-1; i>=0; i--) { 
	        swapVariables(array, 0, i);
	        maxHeapify(array, i, 0); 
	    } 
	    
		return array;
	}
	
 
	public static void main(String[] args) {
		int[] array= new int[] {4,2,7,2,5,8,9,2,6,4,7};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		array=heapSort(array);

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
