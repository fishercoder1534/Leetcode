package stevesun.algorithms;

public class MinimumMovestoEqualArrayElements {
    /**Looked at this solution: https://discuss.leetcode.com/topic/66557/java-o-n-solution-short
     * i.e. Add 1 to n-1 elements basically equals to subtracting 1 from one element. So the easiest way
     * to make all elements in this array equal is to make all of them equal to the minimum element.*/
    public static int minMoves(int[] nums) {
        if(nums.length == 0) return 0;
        int min = nums[0];
        for(int n : nums) min = Math.min(min, n);
        int res = 0;
        for(int n : nums) res += n - min;
        return res;
    }
    
    public static void main(String...args){
        int[] nums = new int[]{1,2,3};
        System.out.println(minMoves(nums));
    }

}
