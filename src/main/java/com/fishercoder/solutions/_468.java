package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 468. Validate IP Address
 *
 *  Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.
 *  IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers,
 *  each ranging from 0 to 255, separated by dots ("."), e.g.,172.16.254.1;
 *  Besides, leading zeros in the IPv4 is invalid. For example, the address 172.16.254.01 is invalid.

 IPv6 addresses are represented as eight groups of four hexadecimal digits,
 each group representing 16 bits.
 The groups are separated by colons (":").
 For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334 is a valid one.
 Also, we could omit some leading zeros among four hexadecimal digits and
 some low-case characters in the address to upper-case ones,
 so 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address(Omit leading zeros and using upper cases).

 However, we don't replace a consecutive group of zero value with a single empty
 group using two consecutive colons (::) to pursue simplicity.
 For example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.

 Besides, extra leading zeros in the IPv6 is also invalid.
 For example, the address 02001:0db8:85a3:0000:0000:8a2e:0370:7334 is invalid.

 Note: You may assume there is no extra space or special characters in the input string.

 Example 1:
 Input: "172.16.254.1"
 Output: "IPv4"
 Explanation: This is a valid IPv4 address, return "IPv4".

 Example 2:
 Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"
 Output: "IPv6"
 Explanation: This is a valid IPv6 address, return "IPv6".

 Example 3:
 Input: "256.256.256.256"
 Output: "Neither"
 Explanation: This is neither a IPv4 address nor a IPv6 address.
 validIPAddress */
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
