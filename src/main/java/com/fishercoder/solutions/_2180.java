package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _2180 {
    public static class Solution1 {
        public int countEven(int num) {
            int ans = 0;
            for (int i = 1; i <= num; i++) {
                List<Integer> list = getAllDigits(i);
                int sum = 0;
                for (int l : list) {
                    sum += l;
                }
                if (sum % 2 == 0) {
                    ans++;
                }
            }
            return ans;
        }

        private List<Integer> getAllDigits(int num) {
            List<Integer> ans = new ArrayList<>();
            while (num != 0) {
                ans.add(num % 10);
                num /= 10;
            }
            return ans;
        }
    }
}
