package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1352 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/product-of-the-last-k-numbers/discuss/510260/JavaC%2B%2BPython-Prefix-Product
         */
        public static class ProductOfNumbers {

            List<Integer> list;

            public ProductOfNumbers() {
                add(0);
            }

            public void add(int num) {
                if (num > 0) {
                    list.add(list.get(list.size() - 1) * num);
                } else {
                    list = new ArrayList<>();
                    list.add(1);
                }
            }

            public int getProduct(int k) {
                int size = list.size();
                return k >= size ? 0 : (list.get(size - 1) / list.get(size - k - 1));
            }
        }
    }
}
