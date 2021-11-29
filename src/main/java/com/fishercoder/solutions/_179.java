package com.fishercoder.solutions;

import java.util.*;

public class _179 {

    public static class Solution1 {
        public String largestNumber(int[] num) {
            if (num.length == 0) {
                return "";
            }
            if (num.length == 1) {
                return Integer.toString(num[0]);
            }
            String[] str = new String[num.length];
            for (int i = 0; i < num.length; i++) {
                str[i] = Integer.toString(num[i]);
            }
            Arrays.sort(str, new StringComparator());
            StringBuilder sb = new StringBuilder("");
            for (int i = num.length - 1; i >= 0; i--) {
                sb.append(str[i]);
            }
            if (sb.charAt(0) == '0') {
                return "0";
            }
            return sb.toString();
        }

        class StringComparator implements Comparator<String> {
            public int compare(String s1, String s2) {
                if (s1.length() == 0 && s2.length() == 0) {
                    return 0;
                }
                if (s2.length() == 0) {
                    return 1;
                }
                if (s1.length() == 0) {
                    return -1;
                }
                for (int i = 0; i < s1.length() && i < s2.length(); i++) {
                    if (s1.charAt(i) > s2.charAt(i)) {
                        return 1;
                    } else if (s1.charAt(i) < s2.charAt(i)) {
                        return -1;
                    }
                }
                if (s1.length() == s2.length()) {
                    return 0;
                }
                if (s1.length() > s2.length()) {
                    if (s1.charAt(0) < s1.charAt(s2.length())) {
                        return 1;
                    } else if (s1.charAt(0) > s1.charAt(s2.length())) {
                        return -1;
                    } else {
                        return compare(s1.substring(s2.length()), s2);
                    }
                } else {
                    if (s2.charAt(0) < s2.charAt(s1.length())) {
                        return -1;
                    } else if (s2.charAt(0) > s2.charAt(s1.length())) {
                        return 1;
                    } else {
                        return compare(s1, s2.substring(s1.length()));
                    }
                }
            }
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 11/29/2021:
         * we'll just sort these numbers as if they are strings.
         */
        public String largestNumber(int[] nums) {
            List<String> strings = new ArrayList<>();
            for (int num : nums) {
                strings.add(Integer.toString(num));
            }
            Collections.sort(strings, (a, b) -> (b + a).compareToIgnoreCase(a + b));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strings.size(); i++) {
                sb.append(strings.get(i));
            }
            return sb.charAt(0) == '0' ? "0" : sb.toString();
        }
    }
}
