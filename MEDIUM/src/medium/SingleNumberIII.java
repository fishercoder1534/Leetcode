package medium;

import java.util.HashMap;
import java.util.Map;

/**260. Single Number III  QuestionEditorial Solution  My Submissions
Total Accepted: 42536
Total Submissions: 92175
Difficulty: Medium
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
*/
public class SingleNumberIII {
    //Approach 1: normal hashmap
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        int[] res = new int[2];
        int index = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1) res[index++] = key;
            if(index == 2) break;
        }
        return res;
    }
}
