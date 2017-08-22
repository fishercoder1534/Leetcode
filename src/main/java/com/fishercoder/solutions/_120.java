package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 For example, given the following triangle
 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

 Note:
 Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.*/
public class _120 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        /**https://discuss.leetcode.com/topic/1669/dp-solution-for-triangle, @stellari has a very excellent explanation.
         * Basically, we use the bottom-up approach, starting from the bottom row of this triangle, and we only need to store the shortest path of each node
         * from its last row, and keep overwriting it until we reach the top.*/
        int n = triangle.size();
        List<Integer> cache = triangle.get(n-1);
        
        for (int layer = n-2; layer >= 0; layer--){//for each layer
            for (int i = 0; i <= layer; i++){//check its very node
                int value = Math.min(cache.get(i), cache.get(i+1)) + triangle.get(layer).get(i);
                cache.set(i, value);
            }
        }
        return cache.get(0);
    }
    
    public static void main(String...strings){
        List<List<Integer>> triangle = new ArrayList();
        triangle.add(Arrays.asList(1));
        triangle.add(Arrays.asList(2,3));
        System.out.println(minimumTotal(triangle));
    }

}
