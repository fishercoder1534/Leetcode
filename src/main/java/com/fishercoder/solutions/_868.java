package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _868 {
    public static class Solution1 {
        public int binaryGap(int N) {
            String bin = Integer.toBinaryString(N);
            List<Integer> oneIndexes = new ArrayList<>();
            for (int i = 0; i < bin.length(); i++) {
                if (bin.charAt(i) == '1') {
                    oneIndexes.add(i);
                }
            }
            int maxGap = 0;
            for (int i = 0; i < oneIndexes.size() - 1; i++) {
                maxGap = Math.max(oneIndexes.get(i + 1) - oneIndexes.get(i), maxGap);
            }
            return maxGap;
        }
    }
}
