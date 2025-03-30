package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3324 {
    public static class Solution1 {
        public List<String> stringSequence(String target) {
            List<String> ans = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (char c : target.toCharArray()) {
                char candidate = 'a';
                boolean firstTime = true;
                do {
                    if (firstTime) {
                        firstTime = false;
                        sb.append(candidate);
                    } else {
                        sb.setLength(sb.length() - 1);
                        candidate = (char) (candidate + 1);
                        sb.append(candidate);
                    }
                    ans.add(sb.toString());
                } while (c != candidate);
            }
            return ans;
        }
    }
}
