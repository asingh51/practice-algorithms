package com.practicealgorithm.sorting;

public class SelectionSort {

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
        
        for (int i = 0; i < array.length-1; i++) 
        { 
            int minIndex = i; 
            for (int j = i+1; j < array.length; j++) 
                if (array[j] < array[minIndex]) 
                	minIndex = j; 
            
            int temp = array[minIndex]; 
            array[minIndex] = array[i]; 
            array[i] = temp; 
        } 
        return array;
	}
	
}
