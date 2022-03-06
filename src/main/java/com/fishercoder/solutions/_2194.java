package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2194 {
    public static class Solution1 {
        public List<String> cellsInRange(String s) {
            char start = s.charAt(0);
            int num1 = Integer.parseInt(s.charAt(1) + "");
            char end = s.charAt(3);
            int num2 = Integer.parseInt(s.charAt(4) + "");
            List<String> ans = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (char startChar = start; startChar <= end; startChar++) {
                for (int c = num1; c <= num2; c++) {
                    sb.setLength(0);
                    sb.append(startChar);
                    sb.append(c);
                    ans.add(sb.toString());
                }
            }
            Collections.sort(ans);
            return ans;
        }
    }
}
