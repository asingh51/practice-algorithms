package com.practicealgorithm.searching;

public class BinarySearch {
	private static int linearSearch(int[] nums, int target) {
		int beg=0;
        int end=nums.length-1;  
        int mid;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(target==nums[mid])
            {return mid;}
        
            if(target>nums[mid])
            {beg=mid+1;}
        
            if(target<nums[mid])
            {end=mid-1;}
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
