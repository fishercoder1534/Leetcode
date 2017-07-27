package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**349. Intersection of Two Arrays
 *
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.*/
public class _349 {
    
    //then I clicked its Tags, and find it's marked with so many tags: Binary Search, HashTable, Two Pointers, Sort, now I'll try to do it one by one
    //inspired by this post: https://discuss.leetcode.com/topic/45685/three-java-solutions
	public int[] intersection_two_pointers(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;
		for(; i < nums1.length && j < nums2.length;){
		    if(nums1[i] < nums2[j]){
		        i++;
		    } else if(nums1[i] > nums2[j]){
		        j++;
		    } else {
		        set.add(nums1[i]);
		        i++;
		        j++;
		    }
		}
		int[] result = new int[set.size()];
		Iterator<Integer> it = set.iterator();
		int k = 0;
		while(it.hasNext()){
		    result[k++] = it.next();
		}
		return result;
	}
	
	public int[] intersection_binary_search(int[] nums1, int[] nums2) {
		//this approach is O(nlgn)
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> intersect = new HashSet();
		for(int i : nums1){
			if(binarySearch(i, nums2)){
				intersect.add(i);
			}
		}
		int[] result = new int[intersect.size()];
		Iterator<Integer> it = intersect.iterator();
		for(int i = 0; i < intersect.size(); i++){
			result[i] = it.next();
		}
		return result;
	}
	
	private boolean binarySearch(int i, int[] nums) {
		int left = 0, right = nums.length-1;
		while(left <= right){
			int mid = left + (right-left)/2;
			if(nums[mid] == i){
				return true;
			} else if(nums[mid] > i){
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return false;
	}
	
	//tried a friend's recommended approach, didn't finish it to get it AC'ed, turned to normal approach as above and got it AC'ed.
	private boolean binarySearch_not_working_version(int i, int[] nums) {
		if(nums == null || nums.length == 0) return false;
		int left = 0, right = nums.length-1;
		while(left+1 < right){
			int mid = left + (right-left)/2;
			if(nums[mid] > i){
				right = mid;
			} else if(nums[mid] < 1){
				left = mid;
			} else if(nums[mid] == i){
				return true;
			} else {
				return false;
			}
		}
		return nums[left] == i || nums[right] == i;
	}

	public static void main(String...strings){
		_349 test = new _349();
		int[] nums1 = new int[]{1,2};
		int[] nums2 = new int[]{2,1};
		test.intersection_binary_search(nums1 , nums2);
	}

	public int[] intersection_two_hashsets(int[] nums1, int[] nums2) {
		//this approach is O(n)
		Set<Integer> set1 = new HashSet();
		for(int i = 0; i < nums1.length; i++){
			set1.add(nums1[i]);
		}
		Set<Integer> intersect = new HashSet();
		for(int i = 0; i < nums2.length; i++){
			if(set1.contains(nums2[i])){
				intersect.add(nums2[i]);
			}
		}
		int[] result = new int[intersect.size()];
		Iterator<Integer> it = intersect.iterator();
		for(int i = 0; i < intersect.size(); i++){
			result[i] = it.next();
		}
		return result;
	}

    //so naturally, I come up with this naive O(n^2) solution and surprisingly it got AC'ed immediately, no wonder it's marked as EASY.
    public int[] intersection_naive(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]) set.add(nums1[i]);
            }
        }
        int[] result = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int i = 0;
        while(it.hasNext()){
            result[i++] = it.next();
        }
        return result;
    }

}
