package com.stevesun.solutions;

public class RangeAddition {
    /**Previously AC'ed brute force solution results in TLE now.*/
    public static int[] getModifiedArray_TLE(int length, int[][] updates) {
        int[] nums = new int[length];
        int k = updates.length;
        for(int i = 0; i < k; i++){
            int start = updates[i][0];
            int end = updates[i][1];
            int inc = updates[i][2];
            for(int j = start; j <= end; j++){
                nums[j] += inc;
            }
        }
        return nums;
    }
    
    /**Looked at this post: https://discuss.leetcode.com/topic/49691/java-o-k-n-time-complexity-solution and one OJ official article: https://leetcode.com/articles/range-addition/*/
    public static int[] getModifiedArray(int length, int[][] updates) {
        int[] nums = new int[length];
        int k = updates.length;
        for (int i = 0; i < k; i++){
            int start = updates[i][0];
            int end = updates[i][1];
            int inc = updates[i][2];
            nums[start] += inc;
            if (end < length-1) nums[end+1] -= inc;
        }
        
        int sum = 0;
        for (int i = 0; i < length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
    
    public static void main(String...args){
    /**5
    [[1,3,2],[2,4,3],[0,2,-2]]*/
        int length = 5;
        int[][] updates = new int[][]{
                {1,3,2},
                {2,4,3},
                {0,2,-2},
        };
        int[] result = getModifiedArray(length, updates);
        for (int i : result) {
            System.out.print(i + "\t");
        }
    }
}
