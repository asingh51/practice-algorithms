package com.practicealgorithm.searching;

public class LinearSearching {
	private static int linearSearch(int[] array, int x) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==x) {
				return i;
			}
		}
		return -1;
	} 
	
	public static void main(String[] args) {
		
		int[] array= new int[] {4,2,7,2,5,8,9,2,6,4,7};
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		int found=linearSearch(array, 8);
		System.out.println(found);

	}
}
