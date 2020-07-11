package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 1359. Count All Valid Pickup and Delivery Options
 *
 * Given n orders, each order consist in pickup and delivery services.
 * Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i).
 * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * Example 1:
 * Input: n = 1
 * Output: 1
 * Explanation: Unique order (P1, D1), Delivery 1 always is after of Pickup 1.
 *
 * Example 2:
 * Input: n = 2
 * Output: 6
 * Explanation: All possible orders:
 * (P1,P2,D1,D2), (P1,P2,D2,D1), (P1,D1,P2,D2), (P2,P1,D1,D2), (P2,P1,D2,D1) and (P2,D2,P1,D1).
 * This is an invalid order (P1,D2,P2,D1) because Pickup 2 is after of Delivery 2.
 *
 * Example 3:
 * Input: n = 3
 * Output: 90
 *
 * Constraints:
 * 1 <= n <= 500
 * */
public class _1359 {
    public static class Solution1 {
        public int countOrders(int n) {
            /**use odd number to denote pickup,
             * and its next even number to denote the corresponding delivery*/
            Set<Integer> set = new HashSet<>();
            for (int i = 1; i <= 2 * n; i++) {
                set.add(i);
            }
            for (int i = 1; i < 2*n; i++) {

            }
            return -1;
        }
    }
}
