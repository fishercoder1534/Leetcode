package stevesun.algorithms;
import java.util.*;

/**Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/
public class RotateArray {

    
    /**My original idea and got AC'ed.
     * One thing to notice is that when k > nums.length, we'll continue to rotate the array, it just becomes k -= nums.length
     * 
     * TODO: look at its Editorial Solution and use O(1) approach to redo it.*/
    public static void rotate(int[] nums, int k) {
        if(k == 0 || k == nums.length) return;
        if(k > nums.length) k -= nums.length;
        List<Integer> tmp = new ArrayList();
        int i = 0;
        if(nums.length-k >= 0){
            i = nums.length-k;
            for(; i < nums.length; i++){
                tmp.add(nums[i]);
            }
        } else {
            i = nums.length-1;
            for(; i >= 0; i--){
                tmp.add(nums[i]);
            }

        }
        for(i = 0; i < nums.length-k; i++){
            tmp.add(nums[i]);
        }
        for(i = 0; i < tmp.size(); i++){
            nums[i] = tmp.get(i);
        }
    }
    
    public static void main(String...strings){
//        int k = 1;
//        int[] nums = new int[]{1,2,3};
//        int[] nums = new int[]{1};
//        int[] nums = new int[]{1,2};
        
//        int k = 3;
//        int[] nums = new int[]{1,2};
        
//        int k = 2;
//        int[] nums = new int[]{1,2};
        
        int k = 4;
        int[] nums = new int[]{1,2,3};
        
//        int k = 2;
//        int[] nums = new int[]{-1};
        rotate(nums, k);
    }

}
