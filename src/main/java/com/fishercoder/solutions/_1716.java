package com.fishercoder.solutions;

public class _1716 {
    public static class Solution1 {
        public int totalMoney(int n) {
            int mondayMoney = 1;
            int total = 0;
            while (n > 0) {
                int weekDays = 0;
                int base = mondayMoney;
                while (weekDays < 7 && n > 0) {
                    total += base;
                    base++;
                    weekDays++;
                    n--;
                }
                mondayMoney++;
            }
            return total;
        }
    }
}
