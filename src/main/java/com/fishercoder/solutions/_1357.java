package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1357 {
    public static class Solution1 {
        public static class Cashier {

            int customerCount;
            int n;
            Map<Integer, Integer> productsToPrices;
            int discount;

            public Cashier(int n, int discount, int[] products, int[] prices) {
                this.n = n;
                this.customerCount = 0;
                this.discount = discount;
                this.productsToPrices = new HashMap<>();
                for (int i = 0; i < products.length; i++) {
                    productsToPrices.put(products[i], prices[i]);
                }
            }

            public double getBill(int[] product, int[] amount) {
                double totalPrice = 0;
                for (int i = 0; i < product.length; i++) {
                    totalPrice += productsToPrices.get(product[i]) * amount[i];
                }
                if (customerCount + 1 == n) {
                    //apply discount
                    totalPrice *= (double) (100 - discount) / 100;
                    customerCount = 0;
                } else {
                    customerCount++;
                }
                return totalPrice;
            }
        }
    }
}
