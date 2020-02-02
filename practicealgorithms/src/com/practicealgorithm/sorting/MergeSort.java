package com.practicealgorithm.sorting;

public class MergeSort {

    public static int[] sort(int[] array) {
        if (array.length == 1) {									// return array without any operation, if size is 1
            return array;
        }
        int pivot = array.length / 2;								// get the mid_value
        int[] left = sort(subArray(array, 0, pivot));				// get the left  side of array to pivot
        int[] right = sort(subArray(array, pivot, array.length));	// get the right side of array to pivot
        int[] mergedAndSortedArray = merge(left, right);			// passing arrays to process merge operation
       
        return mergedAndSortedArray;
    }

    public static int[] subArray(int[] inputArray, int startPosition, int endPosition) {
        int newArrayLength = endPosition - startPosition;			//Get array Size
        int[] subArray = new int[newArrayLength];					//create new subArray
        int postion = startPosition;								//iterator for inputArray
        for (int i = 0; i < newArrayLength; i++) {					
        	subArray[i] = inputArray[postion];						//put values in subArray
        	postion = postion + 1;									//increment iterator
        }
        return subArray;											//return newArray
    }

    public static int[] merge(int[] left, int[] right) {
    	int m = 0, n=0;
        int mergedArrayLength = left.length + right.length;			//get total length of array
        int[] mergedArray = new int[mergedArrayLength];				//create merged Array
        
        for (int i = 0; i < mergedArrayLength; i++) {				
            int merger;
            if(left.length == m) {									//if left array has only one element 
                merger = right[n];									//take value from array
                n++;
            } else if (right.length == n) {							//if right array has only one element 
                merger = left[m];									//take value from array
                m++;
            } else if (left[m] <= right[n]) {						//check if value of left is less than value in right 
                merger = left[m];									//take value from array
                m++;
            } else {												//else if value of right is less than calue in left
                merger = right[n];									//take value from array
                n++;
            }
            mergedArray[i] = merger;								// add value in array
        }
        
        
        return mergedArray;
    }

    public static void main(String[] args) {
    	int[] array= new int[] {4,2,7,2,5,8,9,2,6,4,7,5};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
        int[] sortedArray1 = sort(array);				//start sorting
    	for(int i=0;i<sortedArray1.length;i++) {
			System.out.print(sortedArray1[i]+" ");
		}
		System.out.println();

    }
}
