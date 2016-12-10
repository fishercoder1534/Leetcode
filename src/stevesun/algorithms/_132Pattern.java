package stevesun.algorithms;

import java.util.Stack;

public class _132Pattern {
    //a brute force method got TLE:
    public boolean find132pattern_TLE(int[] nums) {
        for (int i = 0; i < nums.length-2; i++){
            for (int j = i+1; j < nums.length-1; j++){
                if (nums[j] < nums[i]) continue;
                for(int k = j+1; k < nums.length; k++){
                    if(nums[k] < nums[j] && nums[i] < nums[k]) return true;
                }
            }
        }
        return false;
    }
    
    
    /**Looked at this post: https://discuss.leetcode.com/topic/67881/single-pass-c-o-n-space-and-time-solution-8-lines-with-detailed-explanation
     * It scans only once, this is the power of using correct data structure.
     * It goes from the right to the left. It keeps pushing elements into the stack, but it also keeps poping elements out of the stack as long as the current element is bigger than this number.*/
    public static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack();
        
        int s3 = Integer.MIN_VALUE;
        for (int i = nums.length-1; i >= 0; i--){
            if (nums[i] < s3) return true;
            else while (!stack.isEmpty() && nums[i] > stack.peek()){
                s3 = Math.max(s3, stack.pop());
            }
            stack.push(nums[i]);
        }
        
        return false;
    }

    public static void main (String...args){
        int[] nums = new int[]{-1, 3, 2, 0};
        System.out.println(find132pattern(nums));
    }
}
