package com.fishercoder.solutions;

import java.util.StringJoiner;

/**
 * 553. Optimal Division
 *
 * Given a list of positive integers, the adjacent integers will perform the float division. For example, [2,3,4] -> 2 / 3 / 4.
 However, you can add any number of parenthesis at any position to change the priority of operations.
 You should find out how to add parenthesis to get the maximum result,
 and return the corresponding expression in string format.
 Your expression should NOT contain redundant parenthesis.

 Example:
 Input: [1000,100,10,2]
 Output: "1000/(100/10/2)"
 Explanation:
 1000/(100/10/2) = 1000/((100/10)/2) = 200
 However, the bold parenthesis in "1000/((100/10)/2)" are redundant,
 since they don't influence the operation priority. So you should return "1000/(100/10/2)".

 Other cases:
 1000/(100/10)/2 = 50
 1000/(100/(10/2)) = 50
 1000/100/10/2 = 0.5
 1000/100/(10/2) = 2
 Note:

 The length of the input array is [1, 10].
 Elements in the given array will be in range [2, 1000].
 There is only one optimal division for each test case.
 */
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
