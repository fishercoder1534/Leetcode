package com.fishercoder.solutions;

/**
 * 135. Candy

 There are N children standing in a line. Each child is assigned a rating value.

 You are giving candies to these children subjected to the following requirements:

 Each child must have at least one candy.
 Children with a higher rating get more candies than their neighbors.
 What is the minimum candies you must give?
 */
public class _135 {

  public static class Solution1 {
    public int candy(int[] ratings) {
      int[] candy = new int[ratings.length];
      for (int i = 0; i < ratings.length; i++) {
        candy[i] = 1;
      }

      for (int i = 0; i < ratings.length - 1; i++) {
        if (ratings[i] < ratings[i + 1]) {
          candy[i + 1] = candy[i] + 1;
        }
      }

      for (int i = ratings.length - 1; i > 0; i--) {
        if (ratings[i] < ratings[i - 1]) {
          candy[i - 1] = Math.max(candy[i - 1], candy[i] + 1);
        }
      }

      int sum = 0;
      for (int i : candy) {
        sum += i;
      }

      return sum;
    }
  }
}
