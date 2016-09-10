package chapter4_DynamicProgrammingI;
/**Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.*/
public class JumpGame {

    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    public static boolean canJump(int[] A) {
        if(A == null || A.length == 0) return false;
        
        int farthest = A[0];
        for(int i = 0; i < A.length; i++){
            if(i <= farthest && A[i] + i >= farthest) {
                //i <= farthest is to make sure that current i is within the current farthest range
                // A[i] + i >= farthest is to see if it's necessary to update the farthest
                farthest = A[i]+i;
            }
        }
        
        return farthest >= A.length-1;
    }

    public static void main(String...args){
        int[] nums = new int[]{5,8,3,0,6,7,9,6,3,4,5,2,0,6,2,6,7,10,8,0};
        System.out.println(canJump(nums));
    }
}
