package easy;

import utils.CommonUtils;

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
	public int removeElement(int[] nums, int val) {
		for(int i = 0; i < nums.length; i++){
			int start = i;
			while(i < nums.length && nums[i] == val){
				i++;
			}
			if(i == nums.length) i--;
			nums[start] = nums[i];
		}
		CommonUtils.printArray(nums);
		return 0;
	}
	
	public static void main(String...strings){
		RemoveElement test = new RemoveElement();
		int[] nums = new int[]{3,2,2,3};
		int val = 3;
		test.removeElement(nums, val);
	}
}
