package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1823 {
    public static class Solution1 {
        public int findTheWinner(int n, int k) {
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(i + 1);
            }
            int startIndex = 0;
            while (list.size() != 1) {
                int removeIndex = (startIndex + k - 1) % list.size();
                list.remove(removeIndex);
                startIndex = removeIndex;
            }
            return list.get(0);
        }
    }
}
