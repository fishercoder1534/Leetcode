package com.fishercoder.solutions;

import java.util.StringJoiner;

public class _553 {
    public static class Solution1 {
        /**
         * Credit: https://github.com/lydxlx1/LeetCode/blob/master/src/_553.java
         */
        public String optimalDivision(int[] nums) {
            /**https://docs.oracle.com/javase/8/docs/api/java/util/StringJoiner.html:
             * StringJoiner is used to construct a sequence of characters separated by a delimiter and optionally starting with a supplied prefix and ending with a supplied suffix.
             * The String "[George:Sally:Fred]" may be constructed as follows:
             StringJoiner sj = new StringJoiner(":", "[", "]");
             sj.add("George").add("Sally").add("Fred");
             String desiredString = sj.toString();*/

            if (nums.length == 1) {
                return "" + nums[0];
            }
            if (nums.length == 2) {
                return nums[0] + "/" + nums[1];
            }

            /**Tricky one: the solution is fixed: always wrap the one from the second until the last.
             * Another important thing to note that such way could work is that:
             * the prerequisite is: Elements will be in range [2,1000], so no elements are smaller than 1.*/
            StringJoiner stringJoiner = new StringJoiner("/");
            for (int i = 1; i < nums.length; i++) {
                stringJoiner.add("" + nums[i]);
            }
            return String.format("%d/(%s)", nums[0], stringJoiner.toString());
        }
    }

}
