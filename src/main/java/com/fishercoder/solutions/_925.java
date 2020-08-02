package com.fishercoder.solutions;

public class _925 {
    public static class Solution1 {
        public boolean isLongPressedName(String name, String typed) {
            int i = 0;
            for (int j = 0; i < name.length() && j < typed.length(); i++) {
                if (name.charAt(i) != typed.charAt(j)) {
                    return false;
                } else if (i < name.length() - 1 && name.charAt(i) != name.charAt(i + 1)) {
                    j++;
                    while (j < typed.length() && name.charAt(i) == typed.charAt(j)) {
                        j++;
                    }
                } else {
                    j++;
                }

            }
            return i == name.length();
        }
    }
}
