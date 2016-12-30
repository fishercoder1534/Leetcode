package stevesun.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.

 Hint:

 How many majority elements could it possibly have?
 Do you have a better hint? Suggest it!
 */
public class MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(counterMap.containsKey(nums[i])){
                counterMap.put(nums[i], counterMap.get(nums[i])+1);
            } else {
                counterMap.put(nums[i], 1);
            }
        }
        int size = nums.length;
        List<Integer> result = new ArrayList<Integer>();
        for(Integer i : counterMap.keySet()){
            if(counterMap.get(i) > size/3){
                result.add(i);
            }
        }
        return result;
    }

}
