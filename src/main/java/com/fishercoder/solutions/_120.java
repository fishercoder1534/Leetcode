package com.fishercoder.solutions;

import java.util.List;

/**
 * 120. Triangle

  Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

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
  public static class Solution1 {
    public int minimumTotal(List<List<Integer>> triangle) {
      int n = triangle.size();
      List<Integer> cache = triangle.get(n - 1);

      for (int layer = n - 2; layer >= 0; layer--) {
        //for each layer
        for (int i = 0; i <= layer; i++) {
          //check its very node
          int value = Math.min(cache.get(i), cache.get(i + 1)) + triangle.get(layer).get(i);
          cache.set(i, value);
        }
      }
      return cache.get(0);
    }
  }
}
