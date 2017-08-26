package com.fishercoder.solutions;
/**Write a function to find the longest common prefix string amongst an array of strings.*/
public class _14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int i = 0;
        String prefix = "";
        String result = "";
        boolean broken = false;
        while (true) {
            i++;
            result = prefix;
            if (i > strs[0].length()) {
                break;//this will break out the while loop
            }
            prefix = strs[0].substring(0, i);
            for (String word : strs) {
                if (i > word.length() || !word.startsWith(prefix)) {
                    broken = true;
                    break;//this will only break out of the for loop
                }
            }
            if (broken) {
                break;//this will break out the while loop
            }
        }
        return result;
    }

    public static void main(String... strings) {
//        String[] strs = new String[]{"a"};
        String[] strs = new String[]{"a", "b"};
        System.out.println(longestCommonPrefix(strs));
    }
}
