package com.fishercoder.solutions;

public class _161 {
    public static class Solution1 {
        public boolean isOneEditDistance(String s, String t) {
            char[] schar = s.toCharArray();
            char[] tchar = t.toCharArray();

            if (Math.abs(s.length() - t.length()) == 1) {
                char[] longer = (s.length() > t.length()) ? schar : tchar;
                char[] shorter = (longer == schar) ? tchar : schar;

                int diffCnt = 0;
                int i = 0;
                int j = 0;
                for (; i < shorter.length && j < longer.length; ) {
                    if (longer[j] != shorter[i]) {
                        diffCnt++;
                        j++;
                    } else {
                        i++;
                        j++;
                    }
                }
                return diffCnt == 1 || diffCnt == 0;
                //it could be the last char of the longer is the different one, in that case, diffCnt remains to be zero
            } else if (s.length() == t.length()) {
                int diffCnt = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (schar[i] != tchar[i]) {
                        diffCnt++;
                    }
                    if (diffCnt > 1) {
                        return false;
                    }
                }
                return diffCnt == 1;
            }
            return false;
        }
    }
}
