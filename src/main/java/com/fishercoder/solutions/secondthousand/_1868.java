package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1868 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/product-of-two-run-length-encoded-arrays/
         */
        public List<List<Integer>> findRLEArray(int[][] encoded1, int[][] encoded2) {
            //local progress in the current intervals
            int pointer1 = 0;
            int pointer2 = 0;

            //global progress in the overall encoded arrays
            int index1 = 0;
            int index2 = 0;

            List<List<Integer>> result = new ArrayList<>();
            while (index1 < encoded1.length && index2 < encoded2.length) {
                int freq1 = encoded1[index1][1] - pointer1;
                int freq2 = encoded2[index2][1] - pointer2;
                //choose smaller one as the step size
                int freq = Math.min(freq1, freq2);

                //update the local progress in the intervals
                pointer1 += freq;
                pointer2 += freq;

                int product = encoded1[index1][0] * encoded2[index2][0];

                int size = result.size();
                // if the current product is the same as the most recent one in the result, concatenate it
                if (size > 0 && result.get(size - 1).get(0) == product) {
                    freq += result.get(size - 1).get(1);
                    result.remove(size - 1);
                }
                result.add(Arrays.asList(product, freq));

                //check if global progress is moving forward
                if (pointer1 == encoded1[index1][1]) {
                    index1++;
                    pointer1 = 0;
                }

                if (pointer2 == encoded2[index2][1]) {
                    index2++;
                    pointer2 = 0;
                }
            }
            return result;
        }
    }
}
