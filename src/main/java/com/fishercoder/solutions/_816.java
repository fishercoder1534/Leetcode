package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _816 {
    public static class Solution1 {
        public List<String> ambiguousCoordinates(String s) {
            s = s.substring(1, s.length() - 1);
            List<String> list = new ArrayList<>();
            for (int i = 1; i < s.length(); i++) {
                String x = s.substring(0, i);
                List<String> xs = findAllPossibilities(x);
                String y = s.substring(i);
                List<String> ys = findAllPossibilities(y);
                for (String j : xs) {
                    for (String k : ys) {
                        list.add("(" + j + ", " + k + ")");
                    }
                }
            }
            return list;
        }

        private List<String> findAllPossibilities(String str) {
            List<String> result = new ArrayList<>();
            if (str.length() == 1) {
                result.add(str);
                return result;
            } else {
                for (int i = 1; i < str.length(); i++) {
                    String integerPart = str.substring(0, i);
                    String floatPart = str.substring(i);
                    if (integerPart.length() > 1 && integerPart.charAt(0) != '0' && floatPart.charAt(floatPart.length() - 1) != '0') {
                        result.add(integerPart + "." + floatPart);
                    } else if (integerPart.length() == 1 && floatPart.charAt(floatPart.length() - 1) != '0') {
                        result.add(integerPart + "." + floatPart);
                    }
                }
                if (str.charAt(0) != '0') {
                    result.add(str);
                }
            }
            return result;
        }
    }
}
