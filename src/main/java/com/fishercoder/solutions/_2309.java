package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2309 {
    public static class Solution1 {
        public String greatestLetter(String s) {
            List<Character> lowercase = new ArrayList<>();
            List<Character> uppercase = new ArrayList<>();
            for (char c : s.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lowercase.add(c);
                } else {
                    uppercase.add(c);
                }
            }
            Collections.sort(uppercase, Collections.reverseOrder());
            Collections.sort(lowercase, Collections.reverseOrder());
            for (int i = 0; i < uppercase.size(); i++) {
                for (int j = 0; j < lowercase.size(); j++) {
                    if (Character.toLowerCase(uppercase.get(i)) == lowercase.get(j)) {
                        return uppercase.get(i) + "";
                    }
                }
            }
            return "";
        }
    }
}
