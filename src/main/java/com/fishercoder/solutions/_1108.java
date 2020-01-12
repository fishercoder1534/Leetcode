package com.fishercoder.solutions;

/**
 * 1108. Defanging an IP Address
 *
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 *
 * Example 1:
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Example 2:
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 *
 * Constraints:
 * The given address is a valid IPv4 address.
 * */
public class _1108 {
    public static class Solution1 {
        public String defangIPaddr(String address) {
            //String.replaceAll() takes in a regex which needs to be escaped
            return address.replaceAll("\\.", "\\[\\.\\]");
        }
    }

    public static class Solution2 {
        public String defangIPaddr(String address) {
            //String.replace() takes in a string which does NOT need to be escaped
            return address.replace(".", "[.]");
        }
    }
}
