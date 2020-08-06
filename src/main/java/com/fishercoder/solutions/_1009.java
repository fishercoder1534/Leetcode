package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1009 {
    public static class Solution1 {
        public int bitwiseComplement(int N) {
            if (N == 0) {
                return 1;
            }
            List<Integer> list = new ArrayList<>();
            while (N != 0) {
                list.add(N & 1);
                N >>= 1;
            }
            int result = 0;
            int exp = list.size() - 1;
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i) == 0) {
                    result += Math.pow(2, exp);
                }
                exp--;
            }
            return result;
        }
    }
}
