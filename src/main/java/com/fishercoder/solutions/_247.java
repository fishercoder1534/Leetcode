package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

 Find all strobogrammatic numbers that are of length = n.

 For example,
 Given n = 2, return ["11","69","88","96"].

 Hint:

 Try to use recursion and notice that it should recurse with n - 2 instead of n - 1.
 */
public class _247 {
    public List<String> findStrobogrammatic(int n) {
        return recursiveHelper(n, n);
    }

    private List<String> recursiveHelper(int n, int m) {
        if(n == 0) return new ArrayList<String>(Arrays.asList(""));
        if(n == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));

        List<String> list = recursiveHelper(n-2, m);
        List<String> res = new ArrayList<String>();

        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            if(n != m) {
                res.add("0" + s + "0");
            }
            res.add("1" + s + "1");
            res.add("6" + s + "9");
            res.add("8" + s + "8");
            res.add("9" + s + "6");
        }
        return res;
    }
}
