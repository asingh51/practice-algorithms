package com.practicealgorithm.sorting;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		int[] array= new int[] {4,2,7,2,5,8,9,2,6,4,7};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		array=bubblesort(array);

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static int[] bubblesort(int[] array) {
        for (int i = 0; i < array.length-1; i++) 
            for (int j = 0; j < array.length-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
        return array;
	}
}
