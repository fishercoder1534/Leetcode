package com.fishercoder.solutions;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


 The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        int len = height.length;
        if(len == 0){
            return 0;
        }
        int res = 0;

        //first use DP to calculate out left and right arrays
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        left[0] = height[0];
        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        right[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >= 0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        for(int i = 1; i < height.length-1; i++){
            res += Math.min(left[i], right[i]) - height[i];
        }
        return res;
    }

}
