package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 860. Lemonade Change
 *
 * At a lemonade stand, each lemonade costs $5.
 *
 * Customers are standing in a queue to buy from you,
 * and order one at a time (in the order specified by bills).
 * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
 * You must provide the correct change to each customer,
 * so that the net transaction is that the customer pays $5.
 * Note that you don't have any change in hand at first.
 * Return true if and only if you can provide every customer with correct change.
 *
 * Example 1:
 * Input: [5,5,5,10,20]
 * Output: true
 * Explanation:
 * From the first 3 customers, we collect three $5 bills in order.
 * From the fourth customer, we collect a $10 bill and give back a $5.
 * From the fifth customer, we give a $10 bill and a $5 bill.
 * Since all customers got correct change, we output true.
 *
 * Example 2:
 * Input: [5,5,10]
 * Output: true
 *
 * Example 3:
 * Input: [10,10]
 * Output: false
 *
 * Example 4:
 * Input: [5,5,10,10,20]
 * Output: false
 * Explanation:
 * From the first two customers in order, we collect two $5 bills.
 * For the next two customers in order, we collect a $10 bill and give back a $5 bill.
 * For the last customer, we can't give change of $15 back because we only have two $10 bills.
 * Since not every customer received correct change, the answer is false.
 *
 *
 * Note:
 * 0 <= bills.length <= 10000
 * bills[i] will be either 5, 10, or 20.
 */
public class _860 {
  public static class Solution1 {
    public boolean lemonadeChange(int[] bills) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int bill : bills) {
        if (bill == 5) {
          map.put(5, map.getOrDefault(5, 0) + 1);
        } else if (bill == 10) {
          if (!map.containsKey(5)) {
            return false;
          } else {
            map.put(5, map.get(5) - 1);
            if (map.get(5) == 0) {
              map.remove(5);
            }
            map.put(10, map.getOrDefault(10, 0) + 1);
          }
        } else {
          if (!map.containsKey(5)) {
            return false;
          } else {
            if (!map.containsKey(10)) {
              if (!map.containsKey(5) || map.get(5) < 3) {
                return false;
              } else {
                map.put(5, map.get(5) - 3);
                if (map.get(5) == 0) {
                  map.remove(5);
                }
              }
            } else {
              if (!map.containsKey(5)) {
                return false;
              } else {
                map.put(5, map.get(5) - 1);
                if (map.get(5) == 0) {
                  map.remove(5);
                }
                map.put(10, map.get(10) - 1);
                if (map.get(10) == 0) {
                  map.remove(10);
                }
              }
            }
          }
          map.put(20, map.getOrDefault(20, 0) + 1);
        }
      }
      return true;
    }
  }
}
