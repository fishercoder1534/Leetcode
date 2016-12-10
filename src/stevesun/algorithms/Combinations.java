package stevesun.algorithms;
import java.util.*;

public class Combinations {
    //I'm glad that I made this one AC'ed the first time I submitted it.
    //After finishing three similar problems! Cool!

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = i+1;
        }
        backtracking(k, 0, nums, new ArrayList(), result);
        return result;
    }
    
    void backtracking(int k, int start, int[] nums, List<Integer> temp, List<List<Integer>> result){
        if(temp.size() == k){
            List<Integer> newTemp = new ArrayList(temp);
            result.add(newTemp);
        } else if(temp.size() < k){
            for(int i = start; i < nums.length; i++){
                temp.add(nums[i]);
                backtracking(k, i+1, nums, temp, result);
                temp.remove(temp.size()-1);
            }
        }
    }

}
