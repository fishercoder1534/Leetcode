package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1352 {
    public static class Solution1 {
        /*
        Credit: Gemini
         * You can speed both add() and getProduct() up to O(1) time by storing prefix products instead.
         *
         * Why the Prefix Product Approach Works:
         * Instead of updating every previous product when a new number arrives, store the running
         * cumulative product:
         *
         * 1. Start with [1] as a base multiplier.
         * 2. Handle 0 by resetting: Any product that includes 0 evaluates to 0. If num == 0,
         *    clear the list and reset it to.
         * 3. Divide to get the last k product: For num > 0, multiply the last prefix product by
         *    num. To find the product of the last k numbers, divide the latest prefix product by
         *    the prefix product k positions earlier. If k >= list.size(), a 0 was added within
         *    the last k numbers, so return 0.
         */

        public static class ProductOfNumbers {
            List<Integer> list;

            public ProductOfNumbers() {
                list = new ArrayList<>();
                list.add(1);
            }

            public void add(int num) {
                if (num == 0) {
                    list.clear();
                    list.add(1);
                } else {
                    int lastProduct = list.get(list.size() - 1);
                    list.add(num * lastProduct);
                }
            }

            public int getProduct(int k) {
                if (k >= list.size()) {
                    return 0;
                }
                return list.get(list.size() - 1) / list.get(list.size() - k - 1);
            }
        }
    }
}
