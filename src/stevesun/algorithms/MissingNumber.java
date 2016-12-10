package stevesun.algorithms;

public class MissingNumber {
//This post has a very good explanation: https://discuss.leetcode.com/topic/24535/4-line-simple-java-bit-manipulate-solution-with-explaination
    //we can simply XOR with the indices of the array since XOR twice the same number will become zero
    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for(; i < nums.length; i++){
            xor = xor^i^nums[i];
        }
        return xor^i;
    }

}
