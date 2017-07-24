package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]
 */
public class _448 {

    /**O(n) space
     * O(n) time*/
    public List<Integer> findDisappearedNumbers_1(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i : nums) max = Math.max(max, i);
        max = Math.max(max, nums.length);
        //if using extra space is allowed, it'll be super easy as follows:
        Map<Integer, Integer> map = new HashMap();
        for (int i = 1; i <= max; i++){
            map.put(i, 0);
        }

        for ( int i : nums){
            if (map.get(i) == 0){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }

        List<Integer> result = new ArrayList();
        for (int i : map.keySet()){
            if (map.get(i) == 0) result.add(i);
        }

        return result;

    }

    /**O(1) space
     * O(n) time*/
    public List<Integer> findDisappearedNumbers_2(int[] nums) {

        for ( int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0){
                nums[val] = -nums[val];
            }
        }

        List<Integer> result = new ArrayList();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                result.add(i+1);
            }
        }

        return result;

    }

    public static void main(String...args){
        _448 test = new _448();
//        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        int[] nums = new int[]{1,1};
        List<Integer> result = test.findDisappearedNumbers_2(nums);
        for (int i : result){
            System.out.println(i);
        }
    }

}
