package com.fishercoder.solutions;

public class _165 {
    public static class Solution1 {
        public int compareVersion(String version1, String version2) {
            String[] v1s = version1.split(
                    "\\.");//escaping it is very important! Otherwise, it's not going to work as expected!
            String[] v2s = version2.split("\\.");
            int len = (v1s.length < v2s.length) ? v2s.length : v1s.length;
            for (int i = 0; i < len; i++) {
                if (v1s.length == i) {
                    while (i < len) {
                        if (Integer.parseInt(v2s[i]) > 0) {
                            return -1;
                        }
                        i++;
                    }
                } else if (v2s.length == i) {
                    while (i < len) {
                        if (Integer.parseInt(v1s[i]) > 0) {
                            return 1;
                        }
                        i++;
                    }
                } else {
                    if (Integer.parseInt(v1s[i]) > Integer.parseInt(v2s[i])) {
                        return 1;
                    } else if (Integer.parseInt(v2s[i]) > Integer.parseInt(v1s[i])) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }
}
