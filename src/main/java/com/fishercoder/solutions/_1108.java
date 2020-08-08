package com.fishercoder.solutions;

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
