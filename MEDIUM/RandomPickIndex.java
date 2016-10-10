package _20160910_4th_contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomPickIndex {

}

//TODO: use reservoir sampling to solve it again

class Solution {
    //brute force
    int[] input;
    java.util.Random rand = new java.util.Random();
    public Solution(int[] nums) {
        input = nums;
    }
    
    public int pick(int target) {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < input.length; i++){
            if(input[i] == target){
                list.add(i);
            }
        }
        if(list.size() == 1) return list.get(0);
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}


class Solution_MemoryLimitExceeded {

    private Map<Integer, List<Integer>> map = new HashMap();
    java.util.Random rand = new java.util.Random();
    
    public Solution_MLE(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                List<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            } else {
                List<Integer> list = new ArrayList();
                list.add(i);
                map.put(nums[i], list);
            }
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        if(list.size() == 1) return list.get(0);
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}
