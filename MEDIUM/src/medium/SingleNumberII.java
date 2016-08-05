package medium;

import java.util.HashMap;
import java.util.Map;

/**137. Single Number II  QuestionEditorial Solution  My Submissions
Total Accepted: 91512
Total Submissions: 236469
Difficulty: Medium
Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Hide Tags Bit Manipulation
Show Similar Problems
*/
public class SingleNumberII {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) != 3) return key;
        }
        return 0;
    }
    
    public static void main(String...strings){
        int[] nums = new int[]{2,2,3,2};
        SingleNumberII test = new SingleNumberII();
        System.out.println(test.singleNumber(nums));
    }

}
