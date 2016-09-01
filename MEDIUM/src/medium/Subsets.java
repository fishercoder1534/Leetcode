package medium;

import java.util.ArrayList;
import java.util.List;

import utils.CommonUtils;

public class Subsets {

    public static void main(String...strings){
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> result = subsets(nums);
        CommonUtils.printIntegerList(result);
    }
    
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> empty = new ArrayList();
        result.add(empty);
        if(nums == null) return result;
        for(int i = 0; i < nums.length; i++){
            List<List<Integer>> temp = new ArrayList();//you'll have to create a new one here, otherwise, it'll throw ConcurrentModificationException.
            for(List<Integer> list : result){
                List<Integer> newList = new ArrayList(list);
                newList.add(nums[i]);
                temp.add(newList);
            }
            result.addAll(temp);
        }
        return result;
    }

}
