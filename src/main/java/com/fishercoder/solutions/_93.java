package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _93 {

    public static class Solution1 {
        public List<String> restoreIpAddresses(String s) {
            List<String> allValidIpAddresses = new ArrayList<>();
            if (s == null || s.length() > 12 || s.length() < 4) {
                return allValidIpAddresses;
            }
            backtracking(s, new ArrayList<>(), allValidIpAddresses, 0);
            return allValidIpAddresses;
        }

        private void backtracking(String s, ArrayList<String> bytes, List<String> result, int pos) {
            if (bytes.size() == 4) {
                if (pos != s.length()) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 4; i++) {
                    stringBuilder.append(bytes.get(i));
                    stringBuilder.append(".");
                }
                stringBuilder.setLength(stringBuilder.length() - 1);
                result.add(stringBuilder.toString());
                return;
            }

            for (int i = pos; i < pos + 4 && i < s.length(); i++) {
                String oneByte = s.substring(pos, i + 1);
                if (!isValid(oneByte)) {
                    continue;
                }
                bytes.add(oneByte);
                backtracking(s, bytes, result, i + 1);
                bytes.remove(bytes.size() - 1);
            }
        }

        private boolean isValid(String oneByte) {
            if (oneByte.charAt(0) == '0') {
                return oneByte.equals("0");
            }
            int num = Integer.valueOf(oneByte);
            return (num >= 0 && num < 256);
        }
    }
}
