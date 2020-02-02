package com.practicealgorithm.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array= new int[] {4,2,7,2,5,8,9,2,6,4,7};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		array=insertionSort(array);

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) { 
            int key = array[i]; 
            int j = i - 1; 

            while (j >= 0 && array[j] > key) { 
            	array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key;
            
        } 		
        return array;
	}
	
}
