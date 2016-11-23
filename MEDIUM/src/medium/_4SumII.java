package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _4SumII {

    /**Although it's tagged with BinarySearch and HashTable, I didn't come up with a good BinarySearch solution, then looked at this post:
     * https://discuss.leetcode.com/topic/67658/simple-java-solution-with-explanation*/
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap();
        int result = 0, len = A.length;
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                int sum = A[i] + B[j];
                if (map.containsKey(sum)){
                    map.put(sum, map.get(sum)+1);
                } else {
                   map.put(sum, 1); 
                }
            }
        }
        
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                int sum = -(C[i] + D[j]);
                if(map.containsKey(sum)) result += map.get(sum);
            }
        }
        
        return result;
    }

    public static void main(String...args){
        int[] A = new int[]{1,2};
        int[] B = new int[]{-2,-1};
        int[] C = new int[]{-1,2};
        int[] D = new int[]{0,2};
        
        System.out.println(fourSumCount(A, B, C, D));
    }
}
