package chapter4_DynamicProgrammingI;
/**Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

Example
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)*/
public class JumpGameII {

    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public static int jump(int[] A) {
        // write your code here
        if(A == null || A.length == 0) return -1;
        
        int[] steps = new int[A.length];
        steps[0] = 0;
        for(int i = 1; i < A.length; i++) steps[i] = Integer.MAX_VALUE;
        
        for(int i = 1; i < A.length; i++){
            for(int j = 0; j < i; j++){
                if(steps[j] != Integer.MAX_VALUE && j + A[j] >= i){
                    steps[i] = steps[j]+1;
                    break;
                }
            }
        }
        return steps[A.length-1];
    }
    
    public static void main(String...strings){
        int[] A = new int[]{2,3,1,1,4};
        System.out.println(jump(A));
    }

}
