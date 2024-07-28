package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2788 {
    public static class Solution1 {
        public List<String> splitWordsBySeparator(List<String> words, char separator) {
            List<String> ans = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.setLength(0);
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == separator) {
                        if (sb.length() != 0) {
                            ans.add(sb.toString());
                            sb.setLength(0);
                        }
                    } else {
                        sb.append(word.charAt(i));
                    }
                }
                if (sb.length() != 0) {
                    ans.add(sb.toString());
                }
            }
            return ans;
        }
    }
}
