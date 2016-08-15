package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**349. Intersection of Two Arrays  QuestionEditorial Solution  My Submissions
Total Accepted: 37539
Total Submissions: 84405
Difficulty: Easy
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.*/
public class IntersectionOfTwoArrays {
    
    //then I clicked its Tags, and find it's marked with so many tags: Binary Search, HashTable, Two Pointers, Sort, now I'll try to do it one by one
    

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
