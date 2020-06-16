package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _468 {

    public static class Solution1 {

        static final String NEITHER = "Neither";

        public String validIPAddress(String IP) {
            if (IP.contains(".")) {
                return isValidIPv4(IP);
            } else if (IP.contains(":")) {
                return isValidIPv6(IP);
            } else {
                return NEITHER;
            }
        }

        private String isValidIPv6(String IP) {
            if (getDelimiterCount(IP, ':') != 7) {
                return NEITHER;
            }
            String[] bytes = IP.split("\\:");
            if (bytes.length != 8) {
                return NEITHER;
            }
            for (int i = 0; i < 8; i++) {
                if (hasInvalidIPV6Char(bytes[i])) {
                    return NEITHER;
                }
                try {
                    if (bytes[i].length() > 4) {
                        return NEITHER;
                    }
                    int intNum = Integer.parseInt(bytes[i], 16);
                    if (intNum < 0) {
                        return NEITHER;
                    }
                    if (i == 0 && intNum != 0 && bytes[i].charAt(0) == '0') {
                        return NEITHER;
                    }
                } catch (Exception e) {
                    return NEITHER;
                }

            }
            return "IPv6";
        }

        private String isValidIPv4(String IP) {
            if (getDelimiterCount(IP, '.') != 3) {
                return NEITHER;
            }
            String[] bytes = IP.split("\\.");
            if (bytes.length != 4) {
                return NEITHER;
            }
            for (String num : bytes) {
                try {
                    int intNum = Integer.parseInt(num);
                    if (intNum > 255 || intNum < 0) {
                        return NEITHER;
                    }
                    if (intNum != 0) {
                        for (int i = 0; i < num.length(); i++) {
                            if (num.charAt(i) == '0') {
                                return NEITHER;
                            } else {
                                break;
                            }
                        }
                    } else if (intNum == 0) {
                        if (num.length() != 1) {
                            return NEITHER;
                        }
                    }
                } catch (Exception e) {
                    return NEITHER;
                }
            }
            return "IPv4";
        }

        private boolean hasInvalidIPV6Char(String str) {
            Set<Character> set = new HashSet<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                    'a', 'b', 'c', 'd', 'e', 'f', 'A', 'B', 'C', 'D', 'E', 'F'));
            for (char c : str.toCharArray()) {
                if (!set.contains(c)) {
                    return true;
                }
            }
            return false;
        }

        private int getDelimiterCount(String ip, char delimiter) {
            int count = 0;
            for (char c : ip.toCharArray()) {
                if (c == delimiter) {
                    count++;
                }
            }
            return count;
        }
    }
}
