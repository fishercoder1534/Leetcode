package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1309 {
    public static class Solution1 {
        //TODO: very silly solution, optimze it
        public String freqAlphabets(String s) {
            Map<String, String> map = new HashMap<>();
            map.put("1", "a");
            map.put("2", "b");
            map.put("3", "c");
            map.put("4", "d");
            map.put("5", "e");
            map.put("6", "f");
            map.put("7", "g");
            map.put("8", "h");
            map.put("9", "i");
            map.put("10#", "j");
            map.put("11#", "k");
            map.put("12#", "l");
            map.put("13#", "m");
            map.put("14#", "n");
            map.put("15#", "o");
            map.put("16#", "p");
            map.put("17#", "q");
            map.put("18#", "r");
            map.put("19#", "s");
            map.put("20#", "t");
            map.put("21#", "u");
            map.put("22#", "v");
            map.put("23#", "w");
            map.put("24#", "x");
            map.put("25#", "y");
            map.put("26#", "z");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); ) {
                if (Integer.parseInt("" + s.charAt(i)) == 1 && i + 1 < s.length() && i + 2 < s.length() && s.charAt(i + 2) == '#') {
                    sb.append(map.get(s.substring(i, i + 3)));
                    i += 3;
                } else if (Integer.parseInt("" + s.charAt(i)) == 2 && i + 1 < s.length() && i + 2 < s.length() && s.charAt(i + 2) == '#') {
                    sb.append(map.get(s.substring(i, i + 3)));
                    i += 3;
                } else {
                    sb.append(map.get("" + s.charAt(i)));
                    i++;
                }
            }
            return sb.toString();
        }
    }
}
