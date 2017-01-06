package com.stevesun.solutions;

/**27. Remove Element

    Total Accepted: 135216
    Total Submissions: 384018
    Difficulty: Easy

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.*/
public class RemoveElement {
    //then I looked at the Editorial solution, really neat!!! Super elegant and smart!
    public int removeElement_editorial_solution_1(int[] nums, int val){
        //use two pointers, increment j as long as its not equal to val, return i in the end
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val) nums[i++] = nums[j]; 
        }
        return i;
    }
    
    public int removeElement_editorial_solution_2(int[] nums, int val){
        //this approach is very similar to the one below that I came up totally by myself, but it's much concise
        //Here, it didn't check whether nums[n-1] will be equal to val, because in the next iteration, it will still check that number, smart!
        int i = 0, n = nums.length;
        while(i < n){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            } else {
                i++;
            }
        }
        return i;
    }
    
    //just throw all numbers that are equal to val to the end and make a count of it
	public int removeElement(int[] nums, int val) {
	    int count = 0;
	    int len = nums.length, throwPosition = len-1;
	    for(int i = 0; i <= throwPosition; i++){
	        while(throwPosition >= 0 && nums[throwPosition] == val) {
	            throwPosition--;
	            count++;
	        }
	        if(throwPosition == -1 || i >= throwPosition) break;
	        if(nums[i] == val){
	            count++;
	            int temp = nums[throwPosition];
	            nums[throwPosition] = nums[i];
	            nums[i] = temp;
	            throwPosition--;
	        }
	    }
	    return len-count;
	}
	
	public static void main(String...strings){
		RemoveElement test = new RemoveElement();
//		int[] nums = new int[]{3,2,2,3};
//		int val = 3;
		
		int[] nums = new int[]{2,2,3};
        int val = 2;
		
//		int[] nums = new int[]{1};
//        int val = 1;
		System.out.println(test.removeElement(nums, val));
	}
}
